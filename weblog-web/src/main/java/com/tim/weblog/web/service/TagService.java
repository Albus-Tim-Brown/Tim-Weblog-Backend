package com.tim.weblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.dos.TagDO;


public interface TagService extends IService<TagDO> {
    Response queryTagList();
}
