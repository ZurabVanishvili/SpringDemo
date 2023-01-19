package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        //load configuration file


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve beans from container
        Coach myCoach = context.getBean("myCoach",Coach.class);

        //print out some values
        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        //close the connection
        context.close();
    }
}
