package com.xiaoqi.a_result;

import com.opensymphony.xwork2.ActionSupport;

public class Demo3Action extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("Demo3Action");
        return super.execute();
    }

}
