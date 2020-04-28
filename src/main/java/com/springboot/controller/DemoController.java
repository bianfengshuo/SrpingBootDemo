package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by BIANFENGSHUO on 2020/4/22.
 */
@Controller
public class DemoController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return " Hello World ABCDEFDFFFFF!!!";
    }

    @RequestMapping("/index1")
    public String index(Model model) {
        model.addAttribute("name", "jack");
        model.addAttribute("age", 20);
        model.addAttribute("info", "我是一个爱学习的好青年");
        return "index.html";
    }

    @RequestMapping("/say111")
    @ResponseBody
    public String say(){
        return " Hello 你好!!!";
    }
}
