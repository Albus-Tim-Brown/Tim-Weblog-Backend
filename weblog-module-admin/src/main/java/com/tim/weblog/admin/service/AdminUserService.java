package com.tim.weblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.weblog.admin.model.vo.tag.AddTagReqVO;
import com.tim.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.tim.weblog.admin.model.vo.tag.QueryTagPageListReqVO;
import com.tim.weblog.admin.model.vo.tag.SearchTagReqVO;
import com.tim.weblog.admin.model.vo.user.UpdateAdminPasswordReqVO;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.dos.TagDO;
import com.tim.weblog.common.domain.dos.UserDO;


public interface AdminUserService extends IService<UserDO> {
    Response updateAdminPassword(UpdateAdminPasswordReqVO updateAdminPasswordReqVO);
}
