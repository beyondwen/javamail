package com.wenhao.netshop.domain;

/**
 * Created by lw on 2016/11/8.
 */
public class Order {
    private String name;
    private Integer ordernum;

    private String emailAddres;

    public String getEmailAddres() {
        return emailAddres;
    }

    public void setEmailAddres(String emailAddres) {
        this.emailAddres = emailAddres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }
}
