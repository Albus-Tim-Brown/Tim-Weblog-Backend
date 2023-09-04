package com.tim.weblog.admin.service;

import com.tim.weblog.admin.model.vo.article.*;
import com.tim.weblog.common.Response;

import java.util.List;

public interface AdminArticleService {
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);

    Response queryArticleDetail(QueryArticleDetailReqVO queryArticleDetailReqVO);

    Response queryArticlePageList(QueryArticlePageListReqVO queryArticlePageListReqVO);

    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);

    Response updateArticle(UpdateArticleReqVO updateArticleReqVO);

}
