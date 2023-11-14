package com.example.anotation;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "HappyFortuneService -- Today is your UnLucky day !!!";
    }
}
