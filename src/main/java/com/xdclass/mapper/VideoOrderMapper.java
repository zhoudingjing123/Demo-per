package com.xdclass.mapper;

import com.xdclass.pojo.User;
import com.xdclass.pojo.VideoOrder;

import java.util.List;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public interface VideoOrderMapper {
    List<VideoOrder> selectVideoOrderList();
    List<User> queryUserOrder();

}
