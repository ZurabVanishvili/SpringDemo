package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach coach = context.getBean("myCoach",Coach.class);

        Coach coach2 = context.getBean("myCoach",Coach.class);

        boolean res = (coach2==coach);

        //print out some  values

        System.out.println("They are same equals = "+res);

        System.out.println("Memory location" + coach2);

        System.out.println("Memory location" + coach);

        //close the context
        context.close();

    }
}

