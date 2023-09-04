package com.tim.weblog.common.eventbus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-07-01 21:39
 * @Description: TODO
 **/
@Getter
@Builder
public class ArticleEvent {
    private Long articleId;
    private String message;
}
