package com.bdqn.action;

import com.bdqn.pojo.UserInfo;
import com.bdqn.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class UserAction {

    @Resource
    private UserService userService;

    private UserInfo userInfo;

    public String login(){

        userInfo=userService.login(userInfo);

        if(userInfo==null){

            return "error";

        }else{

            ActionContext ac=ActionContext.getContext();
            ac.getSession().put("username",userInfo.getUsername());

            return "success";

        }

    }




    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
