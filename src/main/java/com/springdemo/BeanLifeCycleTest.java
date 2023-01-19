package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {

    public static void main(String[] args) {
        //load configuration file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        //retrieve bean from container
        Coach coach = context.getBean("myCoach",Coach.class);

        System.out.println(coach.getDailyFortune());


        //close the context
        context.close();

    }
}

