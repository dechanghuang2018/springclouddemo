package com.qianfeng.pojo;

import java.util.Date;

/**
 * @Description:
 * @Author: hdc
 * @Date: 2019/8/5 16:17
 */
public class User {
    private Long id;
    private Date date;

    public User() {
    }

    public User(Long id) {
        this.id = id;
        this.date = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
