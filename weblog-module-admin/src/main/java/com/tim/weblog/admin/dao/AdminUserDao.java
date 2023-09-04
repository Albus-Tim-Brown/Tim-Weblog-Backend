package com.tim.weblog.admin.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.dos.TagDO;
import com.tim.weblog.common.domain.dos.UserDO;

import java.util.List;

public interface AdminUserDao {
    UserDO selectByUsername(String username);

    int updateAdminPassword(UserDO userDO);
}
