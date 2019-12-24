package com.dave.spring.cloud.common.entity;

/**
 * @Author: Dave
 * @Date: 2019/12/24 13:05
 * @Description: TODO
 */
public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
