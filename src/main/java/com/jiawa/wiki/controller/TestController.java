package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//展示字符串
@RestController
public class TestController {

    /*获取配置项的值
    * 若没有配置，默认TEST
    * */
    @Value("${test.hello:TEST}")
    private String testHello;

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world!"+testHello;
    }
}
