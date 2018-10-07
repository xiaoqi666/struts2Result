package com.xiaoqi.a_result;

import com.opensymphony.xwork2.ActionSupport;

public class Demo4Action extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("Demo4Action");
        return super.execute();
    }

}
