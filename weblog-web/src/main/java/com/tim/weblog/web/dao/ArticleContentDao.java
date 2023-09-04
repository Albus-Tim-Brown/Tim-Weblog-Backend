package com.tim.weblog.web.dao;

import com.tim.weblog.common.domain.dos.ArticleContentDO;

public interface ArticleContentDao {
    ArticleContentDO selectArticleContentByArticleId(Long articleId);
}
