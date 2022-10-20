package com.designpatterns.strategy;

import com.designpatterns.strategy.withstrategy.*;
import com.designpatterns.strategy.withstrategy.Game;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class GameStrategyTest {

    @Test
    void playEasyMode(){
        Boolean equal = false;
        Game game = new Game();
        String mode = game.play(new EasyStrategy());
        if(mode == "EASY"){
            equal = true;
        }
        Assert.isTrue(equal, "Game isn't EASY Mode: "+ mode);

    }
    @Test
    void playNormalMode(){
        Boolean equal = false;
        Game game = new Game();
        String mode = game.play(new NormalStrategy());
        if(mode == "NORMAL"){
            equal = true;
        }
        Assert.isTrue(equal, "Game isn't NORMAL Mode: "+ mode);

    }
    @Test
    void playHardMode(){
        Boolean equal = false;
        Game game = new Game();
        String mode = game.play(new HardStrategy());
        if(mode == "HARD"){
            equal = true;
        }
        Assert.isTrue(equal, "Game isn't HARD Mode"+ mode);

    }
    @Test
    void playVeryHardMode(){
        Boolean equal = false;
        Game game = new Game();
        String mode = game.play(new VeryHardStrategy());
        if(mode == "VERYHARD"){
            equal = true;
        }
        Assert.isTrue(equal, "Game isn't VERYHARD Mode"+ mode);

    }

}
