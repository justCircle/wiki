package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.service.EbookService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//展示字符串
@RestController



//让写的EbookMapper接口被知道
@MapperScan("com.jiawa.wiki.mapper")
public class EbookController {


    @Resource
    private EbookService ebookService;


    @RequestMapping("/ebook/list")
    public List<Ebook> list ()
    {
        return ebookService.list();
    }
}
