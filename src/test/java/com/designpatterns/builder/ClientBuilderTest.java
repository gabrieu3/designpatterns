package com.designpatterns.builder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ClientBuilderTest {

    @Test
    void createAClientWithoutBuilder(){
        List<String> middleNames = new ArrayList<String>();
        middleNames.add("Meio1");
        middleNames.add("Meio2");
        Client client = new Client("Gabriel","Balestrin", middleNames,34,"Rua das Flores", 50, "89221-148", "Zimbabue");

        Assert.notNull(client,"Client is null");
    }

}
