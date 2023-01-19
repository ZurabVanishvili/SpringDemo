package com.springdemo;

public class CricketCoach implements Coach {

    private String emailAddress;
    private String team;


    private FortuneService fortuneServiceField;

    public CricketCoach() {
        System.out.println("CricketCoach no-arg constructor");
    }


    @Override
    public String getDailyWorkout() {
        return "cricket workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneServiceField.getFortune();
    }

    public CricketCoach(FortuneService fortuneService) {
        fortuneServiceField = fortuneService;

    }

    public void setFortuneServiceField(FortuneService fortuneServiceField) {
        System.out.println("inside method");
        this.fortuneServiceField = fortuneServiceField;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("setter of email");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("setter for team");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }


}
