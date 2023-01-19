package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        //load configuration file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve beans from container

        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);


        //print out some values

        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());

        //get values from properties file

        System.out.println(cricketCoach.getTeam());
        System.out.println(cricketCoach.getEmailAddress());

        //close the connection
        context.close();
    }
}
