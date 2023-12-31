package com.tim.weblog.admin.dao;

import com.tim.weblog.common.domain.dos.ArticleTagRelDO;

import java.util.List;

public interface AdminArticleTagRelDao {
    void insertBatch(List<ArticleTagRelDO> articleTagRelDOS);

    List<ArticleTagRelDO> selectByArticleId(Long articleId);

    int deleteByArticleId(Long articleId);
}
