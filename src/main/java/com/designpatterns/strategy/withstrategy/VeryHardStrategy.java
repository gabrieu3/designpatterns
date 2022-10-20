package com.designpatterns.strategy.withstrategy;

public class VeryHardStrategy implements GameStrategy{
    @Override
    public String play() {
        return "VERYHARD";
    }
}
