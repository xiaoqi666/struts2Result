package com.xiaoqi.b_api;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * 如何在action中获得原生ServletAPI
 */
public class Demo5Action extends ActionSupport {
    @Override
    public String execute() throws Exception {

        ActionContext context = ActionContext.getContext();
        context.put("name", "context");

        Map<String, Object> sessionScope = context.getSession();
        sessionScope.put("name", "sessionScope");

        Map<String, Object> applicationScope = context.getApplication();
        applicationScope.put("name", "applicationScope");

        //原生的request,如此麻烦的原因是struts2并不推荐使用原生的request域,
        // ActionContext和request周期一样,可以当做request域使用
        //  Map<String, Object> requestScope = (Map<String, Object>) context.get("request");
        return super.execute();
    }


}
