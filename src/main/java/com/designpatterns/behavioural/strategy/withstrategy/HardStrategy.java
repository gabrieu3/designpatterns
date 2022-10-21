package com.designpatterns.behavioural.strategy.withstrategy;

public class HardStrategy implements GameStrategy{
    @Override
    public String play() {
        return "HARD";
    }
}
