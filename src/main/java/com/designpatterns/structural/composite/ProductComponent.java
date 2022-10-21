package com.designpatterns.structural.composite;

public abstract class ProductComponent {
    public void operation(){};
    public void add(ProductComponent component){};
    public void remove(ProductComponent component){};
    public void getChild(){};
    public abstract Double getPrice();
}
