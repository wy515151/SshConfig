package com.bdqn.service.impl;

import com.bdqn.dao.UserDao;
import com.bdqn.pojo.UserInfo;
import com.bdqn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public UserInfo login(UserInfo userInfo) {

        return userDao.login(userInfo);

    }
}
