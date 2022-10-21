package com.designpatterns.strategy;

import com.designpatterns.behavioural.strategy.withstrategy.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class GameStrategyTest {

    @Test
    void playEasyMode(){
        Boolean equal = false;
        Game game = new Game();
        game.setGameStrategy(new EasyStrategy());
        String mode = game.play();
        if(mode == "EASY"){
            equal = true;
        }
        Assert.isTrue(equal, "Game isn't EASY Mode: "+ mode);

    }
    @Test
    void playNormalMode(){
        Boolean equal = false;
        Game game = new Game();
        game.setGameStrategy(new NormalStrategy());
        String mode = game.play();
        if(mode == "NORMAL"){
            equal = true;
        }
        Assert.isTrue(equal, "Game isn't NORMAL Mode: "+ mode);

    }
    @Test
    void playHardMode(){
        Boolean equal = false;
        Game game = new Game();
        game.setGameStrategy(new HardStrategy());
        String mode = game.play();
        if(mode == "HARD"){
            equal = true;
        }
        Assert.isTrue(equal, "Game isn't HARD Mode"+ mode);

    }
    @Test
    void playVeryHardMode(){
        Boolean equal = false;
        Game game = new Game();
        game.setGameStrategy(new VeryHardStrategy());
        String mode = game.play();
        if(mode == "VERYHARD"){
            equal = true;
        }
        Assert.isTrue(equal, "Game isn't VERYHARD Mode"+ mode);

    }

}
