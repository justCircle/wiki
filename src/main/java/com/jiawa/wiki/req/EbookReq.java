package com.jiawa.wiki.req;

//请求，可以按id，name请求参数
public class EbookReq {
    private Long id;

    private String name;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}