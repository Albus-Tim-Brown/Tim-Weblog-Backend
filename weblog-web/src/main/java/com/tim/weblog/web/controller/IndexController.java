package com.tim.weblog.web.controller;

import com.tim.weblog.common.PageResponse;
import com.tim.weblog.common.aspect.ApiOperationLog;
import com.tim.weblog.web.model.vo.article.QueryIndexArticlePageListReqVO;
import com.tim.weblog.web.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-18 8:14
 * @Description: 首页
 **/
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private ArticleService articleService;

    /**
     * 适配当前端打包 /dist 到 Spring Boot 项目中，能够访问到首页
     * @return
     */
    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    @PostMapping("/article/list")
    @ApiOperationLog(description = "获取首页文章分页数据")
    public PageResponse queryArticlePageList(@RequestBody QueryIndexArticlePageListReqVO queryArticlePageListReqVO) {
        return articleService.queryIndexArticlePageList(queryArticlePageListReqVO);
    }
}
