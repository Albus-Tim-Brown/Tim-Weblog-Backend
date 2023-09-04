package com.tim.weblog.admin.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.tim.weblog.admin.dao.AdminArticleDao;
import com.tim.weblog.admin.dao.AdminCategoryDao;
import com.tim.weblog.admin.dao.AdminTagDao;
import com.tim.weblog.admin.dao.AdminStatisticsArticlePVDao;
import com.tim.weblog.admin.model.vo.dashboard.QueryDashboardArticleStatisticsRspVO;
import com.tim.weblog.admin.model.vo.dashboard.QueryDashboardPVStatisticsRspVO;
import com.tim.weblog.admin.service.AdminDashboardService;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.constant.Constants;
import com.tim.weblog.common.domain.dos.ArticleCountDO;
import com.tim.weblog.common.domain.dos.StatisticsArticlePVDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-17 12:08
 * @Description: TODO
 **/
@Service
@Slf4j
public class AdminDashboardServiceImpl implements AdminDashboardService {

    @Autowired
    private AdminArticleDao articleDao;
    @Autowired
    private AdminCategoryDao categoryDao;
    @Autowired
    private AdminTagDao tagDao;
    @Autowired
    private AdminStatisticsArticlePVDao statisticsArticlePVDao;

    @Override
    public Response queryDashboardArticleStatisticsInfo() {
        Long articleTotalCount = articleDao.selectTotalCount();
        Long categoryTotalCount = categoryDao.selectTotalCount();
        Long tagTotalCount = tagDao.selectTotalCount();

        // 总浏览量
        List<StatisticsArticlePVDO> pvCounts = statisticsArticlePVDao.selectAllPVCount();
        Long pvTotalCount = pvCounts.stream().mapToLong(StatisticsArticlePVDO::getPvCount).sum();

        QueryDashboardArticleStatisticsRspVO queryDashboardArticleStatisticsRspVO = QueryDashboardArticleStatisticsRspVO.builder()
                .articleTotalCount(Objects.isNull(articleTotalCount) ? 0 : articleTotalCount)
                .categoryTotalCount(Objects.isNull(categoryTotalCount) ? 0 : categoryTotalCount)
                .tagTotalCount(Objects.isNull(tagTotalCount) ? 0 : tagTotalCount)
                .pvTotalCount(pvTotalCount)
                .build();

        return Response.success(queryDashboardArticleStatisticsRspVO);
    }

    @Override
    public Response queryDashboardPublishArticleStatisticsInfo() {
        // 年初
        int currYear = LocalDate.now().getYear();
        LocalDate firstDayOfYear = LocalDate.of(currYear, 1, 1);
        String firstDayStr = firstDayOfYear.format(Constants.DATE_TIME_FORMATTER);

        // 当日
        String currDayStr = LocalDate.now().format(Constants.DATE_TIME_FORMATTER);

        List<ArticleCountDO> articleCountDOS = articleDao.selectArticleCount(firstDayStr, currDayStr);

        Map<String, Long> map = null;
        if (!CollectionUtils.isEmpty(articleCountDOS)) {
            Map<String, Long> dateCountMap = articleCountDOS.stream().collect(Collectors.toMap(ArticleCountDO::getDate, ArticleCountDO::getCount));

            map = Maps.newLinkedHashMap();

            LocalDate currDate = LocalDate.now();
            for (LocalDate date = firstDayOfYear; date.isBefore(currDate) || date.isEqual(currDate); date.plusDays(1)) {
                String key = date.format(Constants.DATE_TIME_FORMATTER);
                map.put(key, Objects.isNull(dateCountMap.get(key)) ? 0L : dateCountMap.get(key));
                date = date.plusDays(1);
            }
        }

        return Response.success(map);
    }

    @Override
    public Response queryDashboardPVStatisticsInfo() {
        List<StatisticsArticlePVDO> statisticsArticlePVDOS = statisticsArticlePVDao.selectLatestWeekRecords();

        QueryDashboardPVStatisticsRspVO queryDashboardPVStatisticsRspVO = null;

        List<String> pvDates = Lists.newArrayList();
        List<Long> pvCounts = Lists.newArrayList();

        LocalDate minus7date = LocalDate.now().minusDays(7);

        for (int i = 1; i < 8; i++) {
            LocalDate plusDate = minus7date.plusDays(i);

            String dateStr = plusDate.format(DateTimeFormatter.ofPattern("MM-dd"));

            pvDates.add(dateStr);
        }

        queryDashboardPVStatisticsRspVO = QueryDashboardPVStatisticsRspVO.builder()
                .pvDates(pvDates)
                .build();

        if (!CollectionUtils.isEmpty(statisticsArticlePVDOS)) {
            DateFormat dateFormat = new SimpleDateFormat("MM-dd");
            Map<String, Long> pvDateCountMap = statisticsArticlePVDOS.stream().collect(Collectors.toMap(p -> {
                Date date = p.getPvDate();
                return dateFormat.format(date);
            }, StatisticsArticlePVDO::getPvCount));

            pvDates.forEach(pvDate -> {
                pvCounts.add(Objects.isNull(pvDateCountMap.get(pvDate)) ? 0 : pvDateCountMap.get(pvDate));
            });

            queryDashboardPVStatisticsRspVO.setPvCounts(pvCounts);
        }

        return Response.success(queryDashboardPVStatisticsRspVO);
    }
}

