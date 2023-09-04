package com.tim.weblog.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.dos.CategoryDO;


public interface CategoryService extends IService<CategoryDO> {
    Response queryCategoryList();

}
