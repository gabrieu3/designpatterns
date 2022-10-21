package com.designpatterns.abstractfactory;

public class IphoneFactory implements UIElementFactory {

    @Override
    public Button createButton() {
        return new IphoneButton();
    }

    @Override
    public Form createForm() {
        return new IphoneForm();
    }
}
