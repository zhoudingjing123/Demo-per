package com.xdclass.proxty;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class adviceDemo {
    public static void main(String[] args) {
        AdviceService adviceService=new AdviceServiceImpl();
        adviceService.collball("aaassff");
        adviceService.save(45,24);
        staticAdvice statica=new staticAdvice(new AdviceServiceImpl());
        statica.save(45,65);
    }
}
