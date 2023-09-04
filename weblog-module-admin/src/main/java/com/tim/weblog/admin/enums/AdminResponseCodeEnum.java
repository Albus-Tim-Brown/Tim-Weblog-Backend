 package com.tim.weblog.admin.enums;

 import com.tim.weblog.common.exception.BaseExceptionInterface;
 import lombok.AllArgsConstructor;
 import lombok.Getter;

 /**
  * @Author: albus
  * @url: albus-tim-brown.gitee.io
  * @Date: 2023-04-18 8:14
  * @Description: 响应枚举
  **/
 @Getter
 @AllArgsConstructor
 public enum AdminResponseCodeEnum implements BaseExceptionInterface {

      SYSTEM_ERROR("10000", "出错啦，后台小哥正在努力修复中");

     private String errorCode;
     private String errorMessage;

 }
