package com.designpatterns.strategy.withstrategy;

public class Game {
    public String play(GameStrategy gameStrategy){
        return gameStrategy.play();
    }
}
