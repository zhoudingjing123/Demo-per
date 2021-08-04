package com.xdclass.mapper;

import org.apache.ibatis.annotations.Param;
import com.xdclass.pojo.Video;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public interface VideoMapper {
    /**
     * 根据id进行查询
     * @param videoId
     * @return
     */
    Video selectById(@Param("video_Id") int videoId);

    /**
     * 查询所有数据   使用注解
     * @return
     */
    @Select("select * from video")
    List<Video> selectList();
    /**
     * 查询所有数据   使用xml
     * @return
     */
    List<Video> selectListXML();
    /**
     * 根据字段进行模糊查询
     */
    List<Video>  selectKile(@Param("point") double point,@Param("title") String title);
    /**
     * 添加一条数据
     * @param video
     */
   int insertTest(Video video);
    /**
     * 批量插入
     */
    int addBatch(List<Video> video);
    /**
     * 修改
     */
    int updateVideo(Video video);
}
