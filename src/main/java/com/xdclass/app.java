package com.xdclass;

import com.xdclass.pojo.Video;
import com.xdclass.pojo.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: DongXin
 * @Description:
 * @Date:
 */
public class app {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //scopeTest(applicationContext);
        scopeList(applicationContext);
//        ((ClassPathXmlApplicationContext) applicationContext).registerShutdownHook();

    }


    public static void scopeTest(ApplicationContext applicationContext) {
        VideoOrder videoOrder = (VideoOrder) applicationContext.getBean("videoOrder");
        System.out.println(videoOrder.getVideo());
    }

    /**
     * TODO 未完成的事情
     *
     * @param applicationContext
     */
    public static void scopeSet(ApplicationContext applicationContext) {
        Video video1 = (Video) applicationContext.getBean("video");
        System.out.println(video1.getTitle());
        System.out.println(video1.getId());


    }

    public static void scopeList(ApplicationContext applicationContext) {
        Video video1 = (Video) applicationContext.getBean("video");


    }
}
