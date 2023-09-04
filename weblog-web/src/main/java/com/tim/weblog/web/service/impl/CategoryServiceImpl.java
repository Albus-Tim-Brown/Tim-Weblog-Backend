package com.tim.weblog.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tim.weblog.common.Response;
import com.tim.weblog.common.domain.mapper.CategoryMapper;
import com.tim.weblog.common.domain.dos.CategoryDO;
import com.tim.weblog.web.dao.CategoryDao;
import com.tim.weblog.web.model.vo.category.QueryCategoryListItemRspVO;
import com.tim.weblog.web.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-17 12:08
 * @Description: TODO
 **/
@Service
@Slf4j
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryDO> implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Response queryCategoryList() {
        List<CategoryDO> categoryDOList = categoryDao.selectAllCategory();
        List<QueryCategoryListItemRspVO> list = null;
        if (!CollectionUtils.isEmpty(categoryDOList)) {
            list = categoryDOList.stream()
                    .map(p -> QueryCategoryListItemRspVO.builder()
                            .id(p.getId())
                            .name(p.getName())
                            .build())
                    .collect(Collectors.toList());
        }
        return Response.success(list);
    }


}
