package com.xiaoqi.c_param;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaoqi.domain.User;

/**
 * 模型驱动获取的参数
 */
public class Demo10Action extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public String execute() throws Exception {
        if (user != null)
            System.out.println(user.getName() + "---" + user.getAge() + "---" + user.getBirthday());
        else {
            System.out.println("user==null");
        }
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
