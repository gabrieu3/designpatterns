package com.designpatterns;


import com.designpatterns.builder.withbuilder.Address;
import com.designpatterns.builder.withbuilder.Client;
import com.designpatterns.builder.withbuilder.Name;
import com.designpatterns.singleton.ApplicationPropertiesSingleton;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Design Pattern Api", version = "1.0", description = "Learn is so beautiful"))
public class DesignpatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignpatternsApplication.class, args);

        /**
         * SINGLETON
         */
        ApplicationPropertiesSingleton app = ApplicationPropertiesSingleton.getInstance();
        System.out.println(app.getProperty("author"));

        /**
         * BUILDER
         */
        List<String> middleNames = new ArrayList<>();
        middleNames.add("Meio1");
        middleNames.add("Meio2");
        Name name = Name.builder().firstName("Gabriel")
                .middleNames(middleNames)
                .lastName("Balestrin")
                .build();
        Address address = Address.builder().address("Rua das Flores").build();

        Client client = Client.builder().name(name).address(address).email("gabriel@email.com").build();


    }

}
