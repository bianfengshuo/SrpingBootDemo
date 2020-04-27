package com.springboot.controller;

import com.springboot.bean.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by BIANFENGSHUO on 2020/4/26.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryalluser")
    @ResponseBody
    public List<User> queryAllUsers(){
        return userService.getUserList();
    }

    @RequestMapping("/userlist")
    public String  queryUsers(Model model){
        List<User> list  = userService.getUserList();
        model.addAttribute("userlist",list);
        return "listuser";
    }

    @RequestMapping("/add_user")
    public String  addUser(Model model){
        return "adduser";
    }

    @RequestMapping("/save_user")
    @ResponseBody
    public String saveUser(HttpServletRequest request) {
        String  id  = request.getParameter("id")==null?"":request.getParameter("id");
        String  username  = request.getParameter("username")==null?"":request.getParameter("username");
        String  password  = request.getParameter("password")==null?"":request.getParameter("password");
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        userService.save(user);
        return "save success !";
    }
}
