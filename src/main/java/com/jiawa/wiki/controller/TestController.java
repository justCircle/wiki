package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//展示字符串
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world!";
    }
}
