package com.sufer.service.impl;

import com.sufer.mapper.UserMapper;
import com.sufer.pojo.User;
import com.sufer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author danger
 * @date 2020/6/1 - 14:08
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectPasswordByName(String userName, String password) {
        return userMapper.selectPasswordByName(userName,password);
    }

    @Override
    public User selectPasswordByEmail(String userEmail, String password) {
        return userMapper.selectPasswordByEmail(userEmail,password);
    }

    @Override
    public int addUser(String userName, String userEmail, String password) {
        return userMapper.addUser(userName, userEmail, password);
    }
}
