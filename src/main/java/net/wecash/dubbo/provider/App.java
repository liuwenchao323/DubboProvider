package net.wecash.dubbo.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liu on 2016/7/12.
 */
public class App {
    public static void main(String[] args){
        try {
            ClassPathXmlApplicationContext  context  = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
            //IDemoService demoService=(IDemoService)ac.getBean("demoService");
            //demoService.sayHello("test");
            context.start();
            System.out.println("dubbo service begin");
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
