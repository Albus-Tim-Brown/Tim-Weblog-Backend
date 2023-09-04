package com.tim.weblog.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tim.weblog.common.exception.BaseExceptionInterface;
import com.tim.weblog.common.exception.BizException;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @Author: albus
 * @from: Tim Brown Weblog : https://albus-tim-brown.gitee.io/
 * @Date: 2023-04-16 10:50
 * @version: v1.0.0
 * @Description: 分页数据响应类
 **/
@Data
public class PageResponse<T> extends Response<List<T>> {

    // 总记录数
    private long total = 0L;
    // 每页显示的记录数
    private long size = 10L;
    // 当前页码
    private long current;
    // 总页数
    private long pages = 0L;

    public static <T> PageResponse<T> success(IPage page, List<T> data) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        response.setCurrent(Objects.isNull(page) ? 0 : page.getCurrent());
        response.setTotal(Objects.isNull(page) ? 0 : page.getTotal());
        response.setSize(Objects.isNull(page) ? 0 : page.getSize());
        response.setPages(Objects.isNull(page) ? 0 : page.getPages());
        response.setData(data);
        return response;
    }


}
