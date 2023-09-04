package com.tim.weblog.web.controller;

import com.tim.weblog.common.PageResponse;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.aspect.ApiOperationLog;
import com.tim.weblog.web.model.vo.archive.QueryArchivePageListReqVO;
import com.tim.weblog.web.model.vo.article.QueryIndexArticlePageListReqVO;
import com.tim.weblog.web.model.vo.article.QueryTagArticlePageListReqVO;
import com.tim.weblog.web.service.ArchiveService;
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
 * @Description: 归档
 **/
@RestController
@RequestMapping("/archive")
public class ArchiveController {

    @Autowired
    private ArchiveService archiveService;

    @PostMapping("/list")
    @ApiOperationLog(description = "获取文章归档列表")
    public Response queryArchive(@RequestBody QueryArchivePageListReqVO queryArchivePageListReqVO) {
        return archiveService.queryArchive(queryArchivePageListReqVO);
    }

}
