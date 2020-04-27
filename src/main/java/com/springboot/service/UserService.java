package com.springboot.service;

import com.springboot.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by BIANFENGSHUO on 2020/4/26.
 */

public interface UserService {

    List<User>  getUserList();
    void save(User user);

}
