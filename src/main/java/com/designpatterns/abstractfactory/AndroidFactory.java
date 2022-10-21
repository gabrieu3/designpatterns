package com.designpatterns.abstractfactory;

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
