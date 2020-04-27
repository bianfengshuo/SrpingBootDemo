package com.springboot.service.impl;

import com.springboot.bean.User;
import com.springboot.mapper.UserMapper;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BIANFENGSHUO on 2020/4/26.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.findAllUser();
    }

    @Override
    public void save(User user) {
        userMapper.saveUser(user);
    }
}
