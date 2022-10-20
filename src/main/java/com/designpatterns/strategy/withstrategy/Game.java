package com.designpatterns.strategy.withstrategy;

public class Game {
    private GameStrategy gameStrategy;

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }
    public String play(){
        return this.gameStrategy.play();
    }
}
