package com.tim.weblog.web.convert;

import com.tim.weblog.common.constant.Constants;
import com.tim.weblog.common.domain.dos.ArticleDO;
import com.tim.weblog.common.domain.dos.BlogSettingDO;
import com.tim.weblog.web.model.vo.article.QueryIndexArticlePageItemRspVO;
import com.tim.weblog.web.model.vo.blogsetting.QueryBlogSettingRspVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;
import java.util.Objects;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-07-30 8:55
 * @Description: TODO
 **/
@Mapper(componentModel = "spring")
public interface BlogSettingConvert {
    BlogSettingConvert INSTANCE = Mappers.getMapper(BlogSettingConvert.class);

    QueryBlogSettingRspVO convert(BlogSettingDO bean);


}
