package com.jiawa.wiki.domain;


//包名叫domain，entity，POJO，这一层实体类就是和数据库表一一映射
//数据库中表叫Test，类名也叫Test    创建实体类
public class Test {
    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
