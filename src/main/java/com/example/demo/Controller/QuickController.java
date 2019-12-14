package com.example.demo.Controller;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QuickController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        System.out.println("springboot");
        return "springboot";
    }

    @ResponseBody
    @RequestMapping("/testUser")
    @Scheduled(cron = "0/5 * * * * ?")
    public List<User> queryUser(){
        return userMapper.queryUserList();
    }
}
