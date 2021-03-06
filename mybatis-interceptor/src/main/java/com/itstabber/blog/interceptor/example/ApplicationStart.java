/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.itstabber.blog.interceptor.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * TODO: 请添加描述
 *
 * @author Stabber
 * @date 2020/3/21 22:42
 * @since 1.0.0
 */
@MapperScan(basePackages = {"com.itstabber.blog.interceptor.example.repository"})
@SpringBootApplication
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class);
    }
}
