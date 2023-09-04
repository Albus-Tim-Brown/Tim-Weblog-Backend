package com.tim.weblog.web.controller;

import com.tim.weblog.common.PageResponse;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.aspect.ApiOperationLog;
import com.tim.weblog.web.model.vo.article.QueryTagArticlePageListReqVO;
import com.tim.weblog.web.service.ArticleService;
import com.tim.weblog.web.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-18 8:14
 * @Description: 标签
 **/
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;
    @Autowired
    private ArticleService articleService;

    @PostMapping("/list")
    @ApiOperationLog(description = "获取所有标签数据")
    public Response queryTagList() {
        return tagService.queryTagList();
    }

    @PostMapping("/article/list")
    @ApiOperationLog(description = "获取所属标签的文章分页数据")
    public PageResponse queryArticlePageList(@RequestBody @Validated QueryTagArticlePageListReqVO queryTagArticlePageListReqVO) {
        return articleService.queryTagArticlePageList(queryTagArticlePageListReqVO);
    }
}
