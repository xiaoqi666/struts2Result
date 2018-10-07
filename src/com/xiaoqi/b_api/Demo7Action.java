package com.xiaoqi.b_api;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

/**
 * 如何在action中获得原生ServletAPI
 * 不推荐
 */
public class Demo7Action extends ActionSupport implements ServletRequestAware, ServletResponseAware {
    private HttpServletRequest request;
    private HttpServletResponse response;

    @Override
    public String execute() throws Exception {
        return super.execute();
    }


    @Override
    public void setServletRequest(HttpServletRequest request) {
        //通过实现接口,获取request
        this.request = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        //通过实现接口,获取response
        this.response = response;
    }
}
