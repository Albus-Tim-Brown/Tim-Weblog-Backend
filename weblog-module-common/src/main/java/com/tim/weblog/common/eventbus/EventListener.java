package com.tim.weblog.common.eventbus;

/**
 * @Author: albus
 * @url: albus-tim-brown.gitee.io
 * @Date: 2023-07-02 9:20
 * @Description: TODO
 **/
public interface EventListener {
    void handleEvent(ArticleEvent weblogEvent);
}
