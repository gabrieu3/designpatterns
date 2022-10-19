package com.designpatterns;

import com.designpatterns.singleton.ApplicationPropertiesSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsApplication.class, args);

		ApplicationPropertiesSingleton app = ApplicationPropertiesSingleton.getInstance();
		System.out.println(app.getProperty("author"));


	}

}
