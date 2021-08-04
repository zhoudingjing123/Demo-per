package com.xdclass.controller;

import com.xdclass.pojo.Video;
import com.xdclass.pojo.Video2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class TestController {
    public static void main(String[] args) {
        Video video=new Video();
        video.setId(0);
        video.setTitle("");
        video.setSummary("");
        video.setCoverImg("");
        video.setPrice(0);
        video.setCreateTime(new Date());
        video.setPoint(0.0D);


        ArrayList<Object> arrayList=new ArrayList<>();
        HashMap<Object,Object> hashMap=new HashMap<>();

        HashSet<Object> hashSet=new HashSet<>();
        if (hashSet==null) {

        }

        System.out.println("ÄúºÃ ´ºÌì");
    }
    public static Video2 tets(Video video){
        Video2 video2 = new Video2();
        video2.setCoverImg(video.getCoverImg());
        video2.setPrice(video.getPrice());
        video2.setCreateTime(video.getCreateTime());
        video2.setPoint(video.getPoint());
        video2.setId(video.getId());
        return video2;

    }
}
