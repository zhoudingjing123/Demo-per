package com.xdclass.pojo;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */

import java.io.Serializable;
import java.util.Date;

/***
 * id
 * outTradeNo
 * state
 * createTime
 * totalFee
 * videoId
 * videoTitle
 * videoImg
 * uesrId
 */
public class VideoOrder  implements Serializable {
    private int id;
    private String  outTradeNo;
    private int  state;
    private Date createTime;
    private int totalFee ;
    private int videoId;
    private String videoTitle;
    private String videoImg;
    private int userId;
    private User user;
    private  Video video;

    public VideoOrder() {
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "id=" + id +
                ", outTradeNo='" + outTradeNo + '\'' +
                ", state=" + state +
                ", createTime=" + createTime +
                ", totalFee=" + totalFee +
                ", videoId=" + videoId +
                ", videoTitle='" + videoTitle + '\'' +
                ", videoImg='" + videoImg + '\'' +
                ", userId=" + userId +
                ", user=" + user +
                ", video=" + video +
                '}';
    }

    public VideoOrder(Video video) {
        this.video=video;
    }

    public VideoOrder(int id, String outTradeNo, int state, Date createTime, int totalFee, int videoId, String videoTitle, String videoImg, int userId, User user, Video video) {
        this.id = id;
        this.outTradeNo = outTradeNo;
        this.state = state;
        this.createTime = createTime;
        this.totalFee = totalFee;
        this.videoId = videoId;
        this.videoTitle = videoTitle;
        this.videoImg = videoImg;
        this.userId = userId;
        this.user = user;
        this.video = video;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(int totalFee) {
        this.totalFee = totalFee;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoImg() {
        return videoImg;
    }

    public void setVideoImg(String videoImg) {
        this.videoImg = videoImg;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
