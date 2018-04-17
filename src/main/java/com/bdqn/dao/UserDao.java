package com.bdqn.dao;

import com.bdqn.pojo.UserInfo;

public interface UserDao {

    /**
     * 验证登录
     * @param userInfo
     * @return
     */
    UserInfo login(UserInfo userInfo);

}
