package com.contro;

import com.model.t_user;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class One {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String save(){
        t_user t=new t_user();
        t.setLogname("1");
        t.setPassword("2");
        t.setEmail("3");
        userService.insert(t);
        return "success";
    }
}
