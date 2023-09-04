package com.tim.weblog.admin.dao;

import com.tim.weblog.common.domain.dos.ArticleContentDO;

public interface AdminArticleContentDao {
    int insertArticleContent(ArticleContentDO articleContentDO);

    ArticleContentDO queryByArticleId(Long articleId);

    int deleteByArticleId(Long articleId);

    int updateByArticleId(ArticleContentDO articleContentDO);
}
