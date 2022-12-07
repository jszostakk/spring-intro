package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyNameMessageService.class);


        MessageService messageService = applicationContext.getBean(MessageService.class);
        MessageService messageService1 = applicationContext.getBean(MessageService.class);
        MessageService messageService2 = applicationContext.getBean(MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService.hashCode());

        System.out.println(messageService1.getMessage());
        System.out.println(messageService1.hashCode());

        System.out.println(messageService2.getMessage());
        System.out.println(messageService2.hashCode());





        //applicationContext.close();
    }
}
