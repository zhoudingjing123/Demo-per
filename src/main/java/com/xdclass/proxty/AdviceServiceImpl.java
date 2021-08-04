package com.xdclass.proxty;

import org.springframework.stereotype.Service;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class AdviceServiceImpl implements AdviceService {


    /**
     * 函数回调
     *
     * @param outTradeNo
     * @return
     */
    public String collball(String outTradeNo) {
        System.out.println("回调   AdviceServiceImpl collball");
        return outTradeNo;
    }

    /**
     * @param userId
     * @param proprctId
     * @return
     */
    public int save(int userId, int proprctId) {
        System.out.println(" AdviceServiceImpl proprctId");
        return proprctId;
    }
}
