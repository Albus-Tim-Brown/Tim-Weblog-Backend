package com.tim.weblog.common.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-04-19 16:06
 * @Description: TODO
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuerySelectListRspVO {
    private String label;
    private Long value;
}
