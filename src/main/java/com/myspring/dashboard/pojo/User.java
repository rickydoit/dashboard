package com.myspring.dashboard.pojo;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private int departmentId;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    private Date createTime;


    public User( String name, int departmentId, Date createTime) {

        this.name = name;
        this.departmentId = departmentId;
        this.createTime = createTime;
    }

}
