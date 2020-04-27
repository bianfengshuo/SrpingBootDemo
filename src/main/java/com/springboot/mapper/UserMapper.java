package com.springboot.mapper;

import com.springboot.bean.User;

import java.util.List;

/**
 * Created by BIANFENGSHUO on 2020/4/26.
 */
public interface UserMapper {
    //查询全部用户
    public List<User> findAllUser();

    //保存用户
    public void saveUser(User user);
}
