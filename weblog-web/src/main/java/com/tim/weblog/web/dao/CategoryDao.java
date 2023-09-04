package com.tim.weblog.web.dao;

import com.tim.weblog.common.domain.dos.CategoryDO;

import java.util.List;

public interface CategoryDao {
    List<CategoryDO> selectAllCategory();

    CategoryDO selectByCategoryId(Long categoryId);
}
