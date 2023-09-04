package com.tim.weblog.web.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tim.weblog.common.domain.mapper.ArticleTagRelMapper;
import com.tim.weblog.common.domain.dos.ArticleTagRelDO;
import com.tim.weblog.web.dao.ArticleTagRelDao;
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
public class ArticleTagRelDaoImpl implements ArticleTagRelDao {

    @Autowired
    private ArticleTagRelMapper articleTagRelMapper;

    @Override
    public List<ArticleTagRelDO> selectByArticleIds(List<Long> articleIds) {
        QueryWrapper<ArticleTagRelDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().in(ArticleTagRelDO::getArticleId, articleIds);
        return articleTagRelMapper.selectList(wrapper);
    }

    @Override
    public List<ArticleTagRelDO> selectByTagId(Long queryTagId) {
        QueryWrapper<ArticleTagRelDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().in(ArticleTagRelDO::getTagId, queryTagId);
        return articleTagRelMapper.selectList(wrapper);
    }

    @Override
    public List<ArticleTagRelDO> selectByArticleId(Long articleId) {
        QueryWrapper<ArticleTagRelDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ArticleTagRelDO::getArticleId, articleId);
        return articleTagRelMapper.selectList(wrapper);
    }
}
