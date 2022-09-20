package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.req.EbookReq;
import com.jiawa.wiki.resp.CommonResp;
import com.jiawa.wiki.resp.EbookResp;
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

    //在list方法里面（封装一个请求参数）EbookReq，这样如果要按id查找，就不用在添加id参数了
    @RequestMapping("/ebook/list")
    public CommonResp list (EbookReq req)
    {
        /*这里的object是泛型，是实际返回业务数据的类型，就是content的类型
        CommonResp<Object> resp = new CommonResp<>();*/
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list= ebookService.list(req);
        resp.setContent(list);
        return resp;


    }
}
