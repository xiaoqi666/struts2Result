package com.xiaoqi.c_param;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xiaoqi.domain.User;

import java.util.List;
import java.util.Map;

/**
 * 集合类型参数封装(form4.jsp)
 */
public class Demo11Action extends ActionSupport {
    private List<String> list;
    private Map<String, String> map;

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("list:" + list);
        System.out.println("map:" + map);
        return SUCCESS;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
