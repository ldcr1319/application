package com.zhc.test.controller;

import com.zhc.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhc on 2018/4/18.
 */
@Controller("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/hi")
    @ResponseBody
    public String getUser(int id) {
        return userService.getUser(id).toString();
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
