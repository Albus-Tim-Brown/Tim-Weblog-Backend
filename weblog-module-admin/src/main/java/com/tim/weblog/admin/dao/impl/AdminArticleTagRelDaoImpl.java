package com.tim.weblog.admin.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tim.weblog.admin.dao.AdminArticleTagRelDao;
import com.tim.weblog.common.domain.mapper.ArticleTagRelMapper;
import com.tim.weblog.common.domain.dos.ArticleTagRelDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-17 12:08
 * @Description: TODO
 **/
@Service
@Slf4j
public class AdminArticleTagRelDaoImpl implements AdminArticleTagRelDao {
    @Autowired
    private ArticleTagRelMapper articleTagRelMapper;

    @Override
    public void insertBatch(List<ArticleTagRelDO> articleTagRelDOS) {
        articleTagRelMapper.insertBatchSomeColumn(articleTagRelDOS);
    }

    @Override
    public List<ArticleTagRelDO> selectByArticleId(Long articleId) {
        QueryWrapper<ArticleTagRelDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ArticleTagRelDO::getArticleId, articleId);
        return articleTagRelMapper.selectList(wrapper);
    }

    @Override
    public int deleteByArticleId(Long articleId) {
        QueryWrapper<ArticleTagRelDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ArticleTagRelDO::getArticleId, articleId);
        return articleTagRelMapper.delete(wrapper);
    }
}
