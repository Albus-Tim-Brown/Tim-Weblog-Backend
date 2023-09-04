package com.tim.weblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: albus
 * @Date: 2023/9/3 17:19
 * @Project: weblog-springboot
 * @Package: com.tim.weblog.web
 * @Description: 2023年9月3日 17:19重构项目
 */
@SpringBootApplication
@ComponentScan({"com.tim.weblog.*"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
