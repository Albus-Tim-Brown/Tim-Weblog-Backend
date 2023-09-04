package com.tim.weblog.admin.dao;


import com.tim.weblog.common.domain.dos.UserRoleDO;

import java.util.List;

public interface AdminUserRoleDao {
    List<UserRoleDO> selectByUsername(String username);
}
