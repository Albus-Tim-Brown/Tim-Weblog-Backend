package com.tim.weblog.web.dao;

import com.tim.weblog.common.domain.dos.ArticleCategoryRelDO;

import java.util.List;

public interface ArticleCategoryRelDao {

    List<ArticleCategoryRelDO> selectByArticleIds(List<Long> articleIds);

    List<ArticleCategoryRelDO> selectByCategoryId(Long categoryId);

    ArticleCategoryRelDO selectByArticleId(Long articleId);
}
