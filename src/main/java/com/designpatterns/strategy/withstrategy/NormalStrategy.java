package com.designpatterns.strategy.withstrategy;

public class NormalStrategy implements GameStrategy{
    @Override
    public String play() {
        return "NORMAL";
    }
}
