package com.entrust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页
 * Created by lixiaohan on 2018/4/12.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
