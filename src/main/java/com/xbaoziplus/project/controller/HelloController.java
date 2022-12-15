package com.xbaoziplus.project.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xbaozi
 * @version 1.0
 * @classname HelloController
 * @date 2022-12-14  15:10
 * @description 初始化访问接口
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @GetMapping
    public String hello() {
        log.info("Access successfully.");
        return "Hello, my project";
    }
}
