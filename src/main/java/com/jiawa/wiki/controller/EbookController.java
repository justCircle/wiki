package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.resp.CommonResp;
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


   /*
   每次返回的内容不太好，通过CommonResp类，把返回值的规范重新定义一下
   @RequestMapping("/ebook/list")
    public List<Ebook> list ()
    {
        return ebookService.list();
    }*/

    @RequestMapping("/ebook/list")
    public CommonResp list ()
    {
        /*这里的object是泛型，是实际返回业务数据的类型，就是content的类型
        CommonResp<Object> resp = new CommonResp<>();*/
        CommonResp<Object> resp = new CommonResp<>();
        List<Ebook> list= ebookService.list();
        resp.setContent(list);
        return resp;
    }
}
