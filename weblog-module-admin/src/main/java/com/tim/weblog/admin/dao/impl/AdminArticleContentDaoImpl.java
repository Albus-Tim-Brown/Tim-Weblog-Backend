package com.tim.weblog.admin.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.tim.weblog.admin.dao.AdminArticleContentDao;
import com.tim.weblog.common.domain.mapper.ArticleContentMapper;
import com.tim.weblog.common.domain.dos.ArticleContentDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-17 12:08
 * @Description: TODO
 **/
@Service
@Slf4j
public class AdminArticleContentDaoImpl implements AdminArticleContentDao {
    @Autowired
    private ArticleContentMapper articleContentMapper;

    @Override
    public int insertArticleContent(ArticleContentDO articleContentDO) {
        return articleContentMapper.insert(articleContentDO);
    }

    @Override
    public ArticleContentDO queryByArticleId(Long articleId) {
        QueryWrapper<ArticleContentDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ArticleContentDO::getArticleId, articleId);
        return articleContentMapper.selectOne(wrapper);
    }

    @Override
    public int deleteByArticleId(Long articleId) {
        QueryWrapper<ArticleContentDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ArticleContentDO::getArticleId, articleId);
        return articleContentMapper.delete(wrapper);
    }

    @Override
    public int updateByArticleId(ArticleContentDO articleContentDO) {
        UpdateWrapper<ArticleContentDO> wrapper = new UpdateWrapper<>();
        wrapper.lambda().eq(ArticleContentDO::getArticleId, articleContentDO.getArticleId());
        return articleContentMapper.update(articleContentDO, wrapper);
    }
}
