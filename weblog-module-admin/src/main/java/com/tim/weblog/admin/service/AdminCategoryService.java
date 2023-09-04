package com.tim.weblog.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tim.weblog.common.domain.dos.CategoryDO;
import com.tim.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.tim.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.tim.weblog.admin.model.vo.category.QueryCategoryPageListReqVO;
import com.tim.weblog.common.PageResponse;
import com.tim.weblog.common.Response;


public interface AdminCategoryService extends IService<CategoryDO> {
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    PageResponse queryCategoryPageList(QueryCategoryPageListReqVO queryCategoryPageListReqVO);

    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    Response queryCategorySelectList();
}
