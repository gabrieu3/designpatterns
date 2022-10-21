package com.designpatterns.creational.factorymethod.products;

public class Magazine implements Product {
    private Integer ID;
    private String name;
    private String description;
    private Double price;

    @Override
    public Double getPromotionalValue() {
        return price - price * 0.1;
    }
}
