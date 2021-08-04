package com.xdclass.proxty;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class staticAdvice implements AdviceService{
    private AdviceService adviceService;

    public staticAdvice(AdviceService adviceService) {
        this.adviceService = adviceService;
    }

    /**
     * 函数回调
     *
     * @param outTradeNo
     * @return
     */
    @Override
    public String collball(String outTradeNo) {
        System.out.println("staticAdvice collball begin");
        String result=adviceService.collball(outTradeNo);
        System.out.println("staticAdvice collball end");
        return result;
    }

    /**
     * @param userId
     * @param proprctId
     * @return
     */
    @Override
    public int save(int userId, int proprctId) {
        System.out.println("staticAdvice save begin");
        int result=adviceService.save(userId,proprctId);
        System.out.println("staticAdvice save end");
        return result;
    }
}
