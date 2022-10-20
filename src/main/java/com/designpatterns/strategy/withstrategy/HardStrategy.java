package com.designpatterns.strategy.withstrategy;

public class HardStrategy implements GameStrategy{
    @Override
    public String play() {
        return "HARD";
    }
}
