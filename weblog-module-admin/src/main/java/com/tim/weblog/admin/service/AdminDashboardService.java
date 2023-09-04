package com.tim.weblog.admin.service;


import com.tim.weblog.common.Response;

public interface AdminDashboardService {

    Response queryDashboardArticleStatisticsInfo();

    Response queryDashboardPublishArticleStatisticsInfo();

    Response queryDashboardPVStatisticsInfo();
}
