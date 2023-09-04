package com.tim.weblog.admin.dao;

import com.tim.weblog.common.domain.dos.CategoryDO;

import java.util.List;

public interface AdminCategoryDao {
    List<CategoryDO> selectAllCategory();

    Long selectTotalCount();
}
