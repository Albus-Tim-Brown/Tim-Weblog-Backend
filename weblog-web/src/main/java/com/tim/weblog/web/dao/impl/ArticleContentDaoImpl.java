package com.tim.weblog.web.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tim.weblog.common.domain.mapper.ArticleContentMapper;
import com.tim.weblog.common.domain.dos.ArticleContentDO;
import com.tim.weblog.web.dao.ArticleContentDao;
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
public class ArticleContentDaoImpl implements ArticleContentDao {
    @Autowired
    private ArticleContentMapper articleContentMapper;

    @Override
    public ArticleContentDO selectArticleContentByArticleId(Long articleId) {
        QueryWrapper<ArticleContentDO> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(ArticleContentDO::getArticleId, articleId);
        return articleContentMapper.selectOne(wrapper);
    }
}
