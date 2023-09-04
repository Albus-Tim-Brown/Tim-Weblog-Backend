package com.tim.weblog.web.service;

import com.tim.weblog.common.PageResponse;
import com.tim.weblog.common.Response;
import com.tim.weblog.web.model.vo.archive.QueryArchivePageListReqVO;
import com.tim.weblog.web.model.vo.article.QueryArticleDetailReqVO;
import com.tim.weblog.web.model.vo.article.QueryCategoryArticlePageListReqVO;
import com.tim.weblog.web.model.vo.article.QueryIndexArticlePageListReqVO;
import com.tim.weblog.web.model.vo.article.QueryTagArticlePageListReqVO;


public interface ArticleService {

    PageResponse queryIndexArticlePageList(QueryIndexArticlePageListReqVO queryIndexArticlePageListReqVO);

    PageResponse queryCategoryArticlePageList(QueryCategoryArticlePageListReqVO queryCategoryArticlePageListReqVO);

    Response queryArticleDetail(QueryArticleDetailReqVO queryArticleDetailReqVO);

    PageResponse queryTagArticlePageList(QueryTagArticlePageListReqVO queryTagArticlePageListReqVO);

}
