package com.xiaoqi.b_api;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;
import java.util.Map;

/**
 * 如何在action中获得原生ServletAPI
 * 不推荐
 */
public class Demo6Action extends ActionSupport {
    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        HttpServletResponse response = ServletActionContext.getResponse();
        PageContext pageContext = ServletActionContext.getPageContext();
        return super.execute();
    }


}
