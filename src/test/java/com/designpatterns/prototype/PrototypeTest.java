package com.designpatterns.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Date;

@SpringBootTest
public class PrototypeTest {

    @Test
    void oneCloneOfSapiens(){
        Boolean equal = false;
        Sapiens sapiens = new Sapiens("Gabriel Balestrin", new Date(1988,7,8),78.0, 1.78 );
        Sapiens sapiensClone = (Sapiens)sapiens.clone();

        if(sapiens.getBirthday().equals(sapiensClone.getBirthday()) &&
                sapiens.getHeight().equals(sapiensClone.getHeight()) &&
                sapiens.getFullName().equals(sapiensClone.getFullName()) &&
                sapiens.getWeight().equals(sapiensClone.getWeight())){
            equal = true;
        };

        Assert.isTrue(equal, "Clone is different from original Object");
    }

    @Test
    void oneCloneOfSNeanderthal(){
        Boolean equal = false;
        Neanderthal neanderthal = new Neanderthal("Gabriel Balestrin", new Date(1988,7,8),78.0, 1.78 );
        Neanderthal neanderthalClone = (Neanderthal)neanderthal.clone();

        if(neanderthal.getBirthday().equals(neanderthalClone.getBirthday()) &&
                neanderthal.getHeight().equals(neanderthalClone.getHeight()) &&
                neanderthal.getFullName().equals(neanderthalClone.getFullName()) &&
                neanderthal.getWeight().equals(neanderthalClone.getWeight())){
            equal = true;
        };

        Assert.isTrue(equal, "Clone is different from original Object");
    }

    @Test
    void oneCloneOfNeanderthalAndDifferent(){
        Boolean equal = false;
        Neanderthal neanderthal = new Neanderthal("Gabriel Balestrin", new Date(1988,7,8),78.0, 1.78 );
        Neanderthal neanderthalClone = (Neanderthal)neanderthal.clone();

        if(neanderthal.getBirthday().equals(neanderthalClone.getBirthday()) &&
                neanderthal.getHeight().equals(neanderthalClone.getHeight()) &&
                neanderthal.getFullName().equals(neanderthalClone.getFullName()) &&
                neanderthal.getWeight().equals(neanderthalClone.getWeight())){
            equal = true;
        };

        Assert.isTrue(equal, "Clone is different from original Object");
    }
}
