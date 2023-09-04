package com.tim.weblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.dos.ArticleDO;
import com.tim.weblog.common.domain.dos.TagDO;
import com.tim.weblog.web.model.vo.archive.QueryArchivePageListReqVO;


public interface ArchiveService extends IService<ArticleDO> {

    Response queryArchive(QueryArchivePageListReqVO queryArchivePageListReqVO);
}
