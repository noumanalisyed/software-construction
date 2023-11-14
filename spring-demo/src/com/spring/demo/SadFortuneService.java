package com.spring.demo;

public class SadFortuneService implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "Today is bad day !!!!";
    }
}
