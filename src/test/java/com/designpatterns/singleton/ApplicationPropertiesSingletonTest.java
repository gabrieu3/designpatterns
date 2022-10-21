package com.designpatterns.singleton;

import com.designpatterns.creational.singleton.ApplicationPropertiesSingleton;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
//import org.springframework.util.Assert;

@SpringBootTest
public class ApplicationPropertiesSingletonTest {

    @Test
    void createOneSingleton(){
        ApplicationPropertiesSingleton singleton = ApplicationPropertiesSingleton.getInstance();
        Assert.notNull(singleton,"Singleton is null");
    }

    @Test
    void createSeveralSingleton(){
        Boolean equal = false;
        ApplicationPropertiesSingleton singleton1 = ApplicationPropertiesSingleton.getInstance();
        ApplicationPropertiesSingleton singleton2 = ApplicationPropertiesSingleton.getInstance();
        if(singleton1 == singleton2){
            equal = true;
        }
        Assert.isTrue(equal,"Singleton isn't equal");
    }

}
