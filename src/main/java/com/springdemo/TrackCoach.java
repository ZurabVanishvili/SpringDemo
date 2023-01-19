package com.springdemo;

public class TrackCoach implements Coach {


    public TrackCoach() {
        System.out.println("no-arg constructor has been called");
    }

    private FortuneService fortuneServiceField;

    public TrackCoach(FortuneService fortuneService) {
        fortuneServiceField = fortuneService;

    }

    @Override
    public String getDailyWorkout() {
        return "Run 5km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServiceField.getFortune();
    }

    //init method
    public void doMyStartupStuff() {
        System.out.println("This is init method");
    }


    //destroy method
    public void doMyDestroyStuff() {
        System.out.println("This is destroy method");
    }

}
