package com.designpatterns.abstractfactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class AbstractFactoryTest {
    @Test
    void createAAndroidWindow(){
        Boolean equal = false;
        UIElementFactory uiElementFactory = new AndroidFactory();

        Form form = uiElementFactory.createForm();
        Button button1 = uiElementFactory.createButton();
        Button button2 = uiElementFactory.createButton();

        if(form instanceof AndroidForm &&
           button1 instanceof AndroidButton &&
           button2 instanceof AndroidButton){
            equal = true;
        }
        Assert.isTrue(equal, "Factory doesn't create right instance of Objects");
    }

    @Test
    void createAIphoneWindow(){
        Boolean equal = false;
        UIElementFactory uiElementFactory = new IphoneFactory();

        Form form = uiElementFactory.createForm();
        Button button1 = uiElementFactory.createButton();
        Button button2 = uiElementFactory.createButton();

        if(form instanceof IphoneForm &&
                button1 instanceof IphoneButton &&
                button2 instanceof IphoneButton){
            equal = true;
        }
        Assert.isTrue(equal, "Factory doesn't create right instance of Objects");
    }
}
