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
public class SqlsessionCaheDemo {
    public static void main(String[] args) throws IOException {

        String resouce = "config/mybatis-config.xml";

        //读取配置文件
        InputStream inputStream = Resources.getResourceAsStream(resouce);

        //构建Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Session
      try {
          SqlSession sqlSession1=sqlSessionFactory.openSession();
          VideoMapper videoMapper1=sqlSession1.getMapper(VideoMapper.class);
          Video video1=videoMapper1.selectById(44);

          SqlSession sqlSession2=sqlSessionFactory.openSession();
          VideoMapper videoMapper2=sqlSession1.getMapper(VideoMapper.class);
          Video video2=videoMapper2.selectById(44);
      }catch (Exception e){
          e.printStackTrace();
      }
    }
}
