package com.xiaoqi.c_param;

import com.opensymphony.xwork2.ActionSupport;
import com.xiaoqi.domain.User;

import java.util.Date;

/**
 * 对象驱动获取的参数
 */
public class Demo9Action extends ActionSupport {

    private User user;

    @Override
    public String execute() throws Exception {
        if (user != null)
            System.out.println(user.getName() + "---" + user.getAge() + "---" + user.getBirthday());
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
