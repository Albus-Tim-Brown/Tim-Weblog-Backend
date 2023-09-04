package com.tim.weblog.admin.controller;

import com.tim.weblog.admin.model.vo.user.QueryUserDetailRspVO;
import com.tim.weblog.admin.model.vo.user.UpdateAdminPasswordReqVO;
import com.tim.weblog.admin.service.AdminBlogSettingService;
import com.tim.weblog.admin.service.AdminUserService;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.aspect.ApiOperationLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-19 16:06
 * @Description: TODO
 **/
@RestController
@RequestMapping("/admin")
public class AdminUserController {

    @Autowired
    private AdminBlogSettingService blogSettingService;
    @Autowired
    private AdminUserService userService;

    @PostMapping("/password/update")
    @ApiOperationLog(description = "修改用户密码")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response updateAdminPassword(@RequestBody @Validated UpdateAdminPasswordReqVO updateAdminPasswordReqVO) {
        return userService.updateAdminPassword(updateAdminPasswordReqVO);
    }

    @PostMapping("/detail")
    @ApiOperationLog(description = "获取登录用户信息")
    public Response<QueryUserDetailRspVO> queryAdminDetail() {
        return blogSettingService.queryNicknameAndAvatar();
    }
}
