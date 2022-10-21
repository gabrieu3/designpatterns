package com.designpatterns.behavioural.strategy.withstrategy;

public class EasyStrategy implements GameStrategy{

    @Override
    public String play() {
        return "EASY";
    }
}
