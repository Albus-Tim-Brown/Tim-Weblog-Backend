package com.tim.weblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.dos.BlogSettingDO;


public interface BlogSettingService extends IService<BlogSettingDO> {

    Response queryBlogSettingDetail();
}
