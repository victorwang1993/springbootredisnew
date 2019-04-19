package com.springbootredis.springbootredis;

import java.io.Serializable;

public class TbUser implements Serializable {
    private Integer id;
    private String username;
    private String age;

    public TbUser() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
