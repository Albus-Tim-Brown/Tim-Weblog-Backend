package com.tim.weblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.weblog.admin.model.vo.blogsetting.UpdateBlogSettingReqVO;
import com.tim.weblog.admin.model.vo.user.QueryUserDetailRspVO;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.dos.BlogSettingDO;


public interface AdminBlogSettingService extends IService<BlogSettingDO> {

    Response updateBlogSetting(UpdateBlogSettingReqVO updateBlogSettingReqVO);

    Response queryBlogSettingDetail();

    Response<QueryUserDetailRspVO> queryNicknameAndAvatar();
}
