package com.designpatterns.creational.abstractfactory;

public class AndroidFactory implements UIElementFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Form createForm() {
        return new AndroidForm();
    }
}
