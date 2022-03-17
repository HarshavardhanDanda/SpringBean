package com.beandemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDemo {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-applicationContext.xml");

        Coach theCoach=context.getBean("newBean", Coach.class);

        Coach alphaCoach=context.getBean("newBean",Coach.class);

        Boolean result= (theCoach==alphaCoach);

        System.out.println(result);
        context.close();
    }
}
