package com.designpatterns.strategy;

public class Game {

    enum level {EASY, NORMAL, HARD, VERYHARD}

    public void play(level l){
        switch(l){
            case EASY:
                System.out.println("EASY Mode");
                break;
            case NORMAL:
                System.out.println("NORMAL Mode");
                break;
            case HARD:
                System.out.println("HARD Mode");
                break;
            case VERYHARD:
                System.out.println("VERYHARD Mode");
                break;
            default:
                break;
        }
    }
}
