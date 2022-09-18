package com.jiawa.wiki.mapper;


//持久层：和数据交互的层 叫Mapper层，也就是以前的Dao层，因为后续要用官方的代码生成器，其代码就是xxxMapper

import com.jiawa.wiki.domain.Test;

import java.util.List;

//在这定义一个Test实体类的接口
public interface TestMapper {

    public List<Test> list();
}
