package com.springbootredis.springbootredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/findAll")
    public List<TbUser> findAll(){
        TbUser tb = new TbUser();
        TbUser tb2 = new TbUser();
        List<TbUser> list = new ArrayList<TbUser>();
        tb.setId(1);
        tb.setUsername("user1");
        list.add(tb);

        tb2.setId(2);
        tb2.setUsername("user2");
        list.add(tb2);

        return list;
    }
}
