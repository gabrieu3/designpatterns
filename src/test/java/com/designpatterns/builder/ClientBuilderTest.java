package com.designpatterns.builder;

import com.designpatterns.builder.withbuilder.Address;
import com.designpatterns.builder.withbuilder.Name;
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

    @Test
    void createAClientWithBuilder(){
        List<String> middleNames = new ArrayList<>();
        middleNames.add("Meio1");
        middleNames.add("Meio2");
        Name name = Name.builder().firstName("Gabriel")
                .middleNames(middleNames)
                .lastName("Balestrin")
                .build();
        Address address = Address.builder().address("Rua das Flores").build();

        com.designpatterns.builder.withbuilder.Client client = com.designpatterns.builder.withbuilder.Client.builder().name(name).address(address).email("gabriel@email.com").build();

        Assert.notNull(client,"Client is null");
    }

    @Test
    void createSeveralClientsWithBuilder(){
        Boolean equal = false;
        List<String> middleNames = new ArrayList<>();
        middleNames.add("Meio1");
        middleNames.add("Meio2");
        Name name = Name.builder().firstName("Gabriel")
                .middleNames(middleNames)
                .lastName("Balestrin")
                .build();
        Address address = Address.builder().address("Rua das Flores").build();

        com.designpatterns.builder.withbuilder.Client client = com.designpatterns.builder.withbuilder.Client.builder().name(name).address(address).email("gabriel@email.com").build();
        com.designpatterns.builder.withbuilder.Client client1 = com.designpatterns.builder.withbuilder.Client.builder().name(name).address(address).email("gabriel@email.com").build();

        if(client == client1){
            equal = true;
        }

        Assert.isTrue(!equal,"Client is different from Client1");
    }

}
