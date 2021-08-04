package com.xdclass.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: DongXin
 * @Description:视频类
 * @Date:
 */
public class Video2 implements Serializable {
    private Integer id;//主键
    //private Integer bbc;//价格
    private String coverImg;//封面
    private Integer price;//价格
    private Date createTime;//创建时间
    private double point;//评分

    public Video2() {
    }

    public String getCoverImg() {
        return coverImg;
    }

    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
