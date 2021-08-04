package com.xdclass;

import com.xdclass.mapper.VideoMapper;
import com.xdclass.pojo.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class SqlsessionDemo {
    /**
     * TODO 稍后
     *
     */
    public static void main(String[] args) throws IOException {

        String resouce = "config/mybatis-config.xml";

        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resouce);

        //构建Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Session
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {

            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
           // VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);

            for (int i = 0; i < 2; i++) {
                Video video = videoMapper.selectById(44);
                System.out.println(video.toString());
            }
//            //通过注解查找
//            List<Video> videoList =  videoMapper.selectList();
//            List<Video> videoList =  videoMapper.selectListXML();
//            List<Video> videoList= videoMapper.selectKile(8.7,"HTML");
//            System.out.println(videoList.toString());
            //新增一条记录
//            Video video =  new Video();
//            video.setTitle("DDDD信息欢迎你的时代");
//            video.setCoverImg("xdclass.net/aaa.png");
//            video.setPoint(9.4);
//            video.setCreateTime(new Date());
//            video.setPrice(9900);
//            video.setSummary("这个是面试专题概要");
//
//            //新增一条记录
//            Video video1 =  new Video();
//            video1.setTitle("YYDS信息欢迎你的时代");
//            video1.setCoverImg("xdclass.net/aaa.png");
//            video1.setPoint(9.4);
//            video1.setCreateTime(new Date());
//            video1.setPrice(9900);
//            video1.setSummary("这个是面试专题概要");
//
//            List<Video> videos=new ArrayList<>();
//            videos.add(video);
//            videos.add(video1);
//
//            int rows = videoMapper.addBatch(videos);
//
//            System.out.println(rows);
            /**
             * 修改
             */
//        Video video=new Video();
//        video.setId(40);
//        video.setTitle("啦啦啦啦啦奥奥绿啦绿啦绿啦绿绿绿绿绿");
//        int row=videoMapper.updateVideo(video);
//            System.out.println(row);
//
//            List<VideoOrder> list=videoOrderMapper.selectVideoOrderList();
//            System.out.println(list.toString());

//            List<User> list=videoOrderMapper.queryUserOrder();
//            System.out.println(list.toString());


        }

    }
}
