package com.springdemo;

public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("no-arg constructor");
    }

    private FortuneService fortuneServiceField;

    public BaseballCoach(FortuneService fortuneService) {
        fortuneServiceField = fortuneService;
    }

    public void setFortuneServiceField(FortuneService fortuneServiceField) {
        System.out.println("this is setter method");
        this.fortuneServiceField = fortuneServiceField;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on bating practice";

    }

    @Override
    public String getDailyFortune() {
        return fortuneServiceField.getFortune();
    }
}
