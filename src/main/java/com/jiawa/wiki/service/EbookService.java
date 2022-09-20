package com.jiawa.wiki.service;

//业务逻辑层，把所有的逻辑写在service里面
//对数据库进行操作，先把持久层弄好，到service写业务逻辑

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookReq;
import com.jiawa.wiki.resp.EbookResp;
import com.jiawa.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


//@Service 这样spring才会把service扫描进来
@Service
public class EbookService {

    //把TestMapper引入进来
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req)
    {
        //前面两句是通用的，意思就是创建一个where语句
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria=ebookExample.createCriteria();
        criteria.andNameLike('%'+req.getName()+'%');
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        /*
        //把Ebook对象转换成EbookResp对象，最后写成返回值
        List<EbookResp> respList=new ArrayList<>();
        for (Ebook ebook : ebookList) {
            *//*没有用CopyUtil这个类之前的写法
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);*//*

            //用了CopyUtil之后的写法,单个对象的复制
            EbookResp ebookResp = CopyUtil.copy(ebook, EbookResp.class);

            respList.add(ebookResp);
        }*/

        //多个对象复制即为列表复制
        List<EbookResp> respList = CopyUtil.copyList(ebookList, EbookResp.class);

        return respList;
    }

}
