package com.entrust.controller;

import com.entrust.domain.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 * Created by lixiaohan on 2018/4/12.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/info")
    public User getUserInfo() {
        User user = new User();
        user.setNick("Test");
        return user;
    }
}
