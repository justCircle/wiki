package com.jiawa.wiki.service;

//业务逻辑层，把所有的逻辑写在service里面

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


//@Service 这样spring才会把service扫描进来
@Service
public class TestService {

    //把TestMapper引入进来
    @Resource
    private TestMapper testMapper;

    public List<Test> list()
    {
        return testMapper.list();
    }

}
