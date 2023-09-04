package com.tim.weblog.admin.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tim.weblog.common.domain.dos.ArticleCountDO;
import com.tim.weblog.common.domain.dos.ArticleDO;

import java.util.Date;
import java.util.List;

public interface AdminArticleDao {
    int insertArticle(ArticleDO articleDO);

    ArticleDO queryByArticleId(Long articleId);

    Page<ArticleDO> queryArticlePageList(Long current, Long size, Date startDate, Date endDate, String searchTitle);

    int deleteById(Long articleId);

    int updateById(ArticleDO articleDO);

    Long selectTotalCount();

    List<ArticleCountDO> selectArticleCount(String startDate, String endDate);

    int readNumIncrease(Long articleId);
}
