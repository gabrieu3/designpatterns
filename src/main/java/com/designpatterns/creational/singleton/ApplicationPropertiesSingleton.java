package com.designpatterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ApplicationPropertiesSingleton {

    private static ApplicationPropertiesSingleton instance;
    private Properties properties;
    private ApplicationPropertiesSingleton() {
        this.properties = new Properties();
        this.readFileProperties();
    }

    public static ApplicationPropertiesSingleton getInstance(){
        if(instance == null){
            instance = new ApplicationPropertiesSingleton();
        }
        return instance;
    }

    public String getProperty(String property){
        return properties.getProperty(property);
    }

    private void readFileProperties(){
        try{
            properties.load(new FileInputStream("./classes/application.properties"));
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Não encontrou o arquivo application.properties");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
