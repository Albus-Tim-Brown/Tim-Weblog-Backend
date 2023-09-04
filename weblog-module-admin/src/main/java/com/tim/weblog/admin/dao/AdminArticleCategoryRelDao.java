package com.tim.weblog.admin.dao;

import com.tim.weblog.common.domain.dos.ArticleCategoryRelDO;

public interface AdminArticleCategoryRelDao {
    int insert(ArticleCategoryRelDO articleCategoryRelDO);

    ArticleCategoryRelDO selectByArticleId(Long articleId);

    int deleteByArticleId(Long articleId);
}
