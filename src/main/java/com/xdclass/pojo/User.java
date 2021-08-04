package com.xdclass.pojo;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * id
 * name
 * pwd
 * headImg
 * phone
 * createTime
 */
public class User implements Serializable {

    private int id;
    private String name;
    private String pwd;
    private String headImg;
    private String phone;
    private Date createTime;
    private List<VideoOrder> orderList;

    public List<VideoOrder> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<VideoOrder> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", headImg='" + headImg + '\'' +
                ", phone=" + phone +
                ", createTime=" + createTime +
                '}';
    }

    public User(int id, String name, String pwd, String headImg, String phone, Date createTime) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.headImg = headImg;
        this.phone = phone;
        this.createTime = createTime;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
