package com.xiaoqi.c_param;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

/**
 * 属性驱动获取的参数
 */
public class Demo8Action extends ActionSupport {
    //第一种获取参数的方式,只需要准备与参数键相同的属性即可
    private String name;
    //自动类型转换,只能转换8中基本数据类型以及对应的包装类
    private Integer age;
    private Date birthday;//只支持yyyy-MM-dd这种格式进行String--->Date的自动转换

    public Demo8Action() {
        //super 会执行下面的execute方法
        super();
        System.out.println("Demo8Action被创建了");
    }

    @Override
    public String execute() throws Exception {
        System.out.println("name的值: " + name + "age的值:" + age + "生日:" + birthday);
        return SUCCESS;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
