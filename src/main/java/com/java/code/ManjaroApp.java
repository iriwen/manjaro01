package com.java.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * created by yuxiaodong01 on 2020/04/02.
 * 启用缓存
 */
@SpringBootApplication
@EnableCaching
public class ManjaroApp {
    public static void main(String[] args) {
        SpringApplication.run(ManjaroApp.class, args);
    }
}
