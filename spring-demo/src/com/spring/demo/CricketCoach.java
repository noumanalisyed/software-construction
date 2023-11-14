package com.spring.demo;

public class CricketCoach implements Coach{

    private String email;
    private String team;
    private FortuneService fortuneService;

    public CricketCoach() {

    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter -- Injection called ...");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do Bowling practise for 1 hour";
    }

    @Override
    public String getInformation() {
        return "Hello Cricket Coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
