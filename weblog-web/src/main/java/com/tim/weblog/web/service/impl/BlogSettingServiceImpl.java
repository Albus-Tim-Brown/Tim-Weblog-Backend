package com.tim.weblog.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.mapper.BlogSettingMapper;
import com.tim.weblog.common.domain.dos.BlogSettingDO;
import com.tim.weblog.web.convert.BlogSettingConvert;
import com.tim.weblog.web.model.vo.blogsetting.QueryBlogSettingRspVO;
import com.tim.weblog.web.service.BlogSettingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-17 12:08
 * @Description: TODO
 **/
@Service
@Slf4j
public class BlogSettingServiceImpl extends ServiceImpl<BlogSettingMapper, BlogSettingDO> implements BlogSettingService {

    @Autowired
    private BlogSettingConvert blogSettingConvert;

    @Override
    public Response queryBlogSettingDetail() {
        BlogSettingDO blogSettingDO = getOne(null);
        return Response.success(blogSettingConvert.convert(blogSettingDO));
    }
}
