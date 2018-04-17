package com.bdqn.service;

import com.bdqn.pojo.UserInfo;

public interface UserService {
    /**
     * 验证登录
     * @param userInfo
     * @return
     */
    UserInfo login(UserInfo userInfo);
}
