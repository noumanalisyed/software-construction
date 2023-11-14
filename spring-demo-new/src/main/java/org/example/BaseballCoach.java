package org.example;

public class BaseballCoach implements Coach{
    FortuneService fortuneService;
    public BaseballCoach(){

    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Do 30 minutes running";
    }
    @Override
    public String getDailyFortune(){
        return "Today is your lucky day";
    }
    @Override
    public String getInformation(){
        return "Baseball -- very popular sports in USA";
    }
}
