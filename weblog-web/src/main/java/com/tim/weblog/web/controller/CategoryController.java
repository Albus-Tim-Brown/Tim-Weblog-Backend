package com.tim.weblog.web.controller;

import com.tim.weblog.common.PageResponse;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.aspect.ApiOperationLog;
import com.tim.weblog.web.model.vo.article.QueryCategoryArticlePageListReqVO;
import com.tim.weblog.web.service.ArticleService;
import com.tim.weblog.web.service.CategoryService;
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
 * @Description: 分类
 **/
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ArticleService articleService;

    @PostMapping("/list")
    @ApiOperationLog(description = "获取所有分类数据")
    public Response queryCategoryList() {
        return categoryService.queryCategoryList();
    }

    @PostMapping("/article/list")
    @ApiOperationLog(description = "获取所属分类的文章分页数据")
    public PageResponse queryArticlePageList(@RequestBody @Validated QueryCategoryArticlePageListReqVO queryCategoryArticlePageListReqVO) {
        return articleService.queryCategoryArticlePageList(queryCategoryArticlePageListReqVO);
    }


}
