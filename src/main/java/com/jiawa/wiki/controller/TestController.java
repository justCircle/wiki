package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//展示字符串
@RestController



//让写的TestMapper接口被知道
@MapperScan("com.jiawa.wiki.mapper")
public class TestController {

    /*获取配置项的值
    * 若没有配置，默认TEST
    * */
    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world!"+testHello;
    }

    @RequestMapping("/test/list")
    public List<Test> list ()
    {
        return testService.list();
    }
}
