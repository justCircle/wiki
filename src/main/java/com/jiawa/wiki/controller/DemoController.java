package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.service.DemoService;
import com.jiawa.wiki.service.TestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//展示字符串
@RestController



//让写的DemoMapper接口被知道
@MapperScan("com.jiawa.wiki.mapper")
public class DemoController {


    @Resource
    private DemoService demoService;


    @RequestMapping("/demo/list")
    public List<Demo> list ()
    {
        return demoService.list();
    }
}
