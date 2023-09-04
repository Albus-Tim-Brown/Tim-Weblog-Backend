package com.tim.weblog.admin.controller;

import com.tim.weblog.admin.model.vo.blogsetting.UpdateBlogSettingReqVO;
import com.tim.weblog.admin.service.AdminBlogSettingService;
import com.tim.weblog.admin.service.AdminDashboardService;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.aspect.ApiOperationLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-19 16:06
 * @Description: 后台首页 - 仪表盘
 **/
@RestController
@RequestMapping("/admin/dashboard")
public class AdminDashboardController {

    @Autowired
    private AdminDashboardService dashboardService;

    @PostMapping("/article/statistics")
    @ApiOperationLog(description = "获取后台仪表盘文章统计信息")
    public Response queryDashboardArticleStatisticsInfo() {
        return dashboardService.queryDashboardArticleStatisticsInfo();
    }

    @PostMapping("/publishArticle/statistics")
    @ApiOperationLog(description = "获取后台仪表盘文章发布 echat 统计信息")
    public Response queryDashboardPublishArticleStatisticsInfo() {
        return dashboardService.queryDashboardPublishArticleStatisticsInfo();
    }

    @PostMapping("/pv/statistics")
    @ApiOperationLog(description = "获取后台仪表盘 PV echat 统计信息")
    public Response queryDashboardPVStatisticsInfo() {
        return dashboardService.queryDashboardPVStatisticsInfo();
    }

}
