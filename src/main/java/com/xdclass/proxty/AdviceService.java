package com.xdclass.proxty;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public  interface AdviceService {
    /**
     * 函数回调
     * @param outTradeNo
     * @return
     */
    String collball(String outTradeNo);

    /**
     *
     * @param
     * @return
     */
    int save(int userId,int proprctId);

}
