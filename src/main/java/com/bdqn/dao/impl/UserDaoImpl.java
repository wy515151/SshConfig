package com.bdqn.dao.impl;

import com.bdqn.dao.UserDao;
import com.bdqn.pojo.UserInfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private SessionFactory sessionFactory;

    public UserInfo login(UserInfo userInfo) {

        System.out.println("账号："+userInfo.getUsername());
        System.out.println("密码："+userInfo.getPassword());
        Session session=sessionFactory.openSession();

        //session.createSQLQuery(sql语句)
        Query query=session.createQuery("from UserInfo where username=? and password=?");
        query.setString(0,userInfo.getUsername());
        query.setString(1,userInfo.getPassword());

        userInfo= (UserInfo) query.uniqueResult();

        System.out.println("userInfo...."+userInfo);
        session.close();
        return userInfo;
    }
}
