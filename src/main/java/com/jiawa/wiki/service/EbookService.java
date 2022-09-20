package com.jiawa.wiki.service;

//业务逻辑层，把所有的逻辑写在service里面
//对数据库进行操作，先把持久层弄好，到service写业务逻辑

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


//@Service 这样spring才会把service扫描进来
@Service
public class EbookService {

    //把TestMapper引入进来
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list()
    {
        return ebookMapper.selectByExample(null);
    }

}
