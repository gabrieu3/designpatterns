package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.products.Magazine;
import com.designpatterns.creational.factorymethod.products.Product;

public class MagazineFactory extends ProductFactory{
    @Override
    public Product getProduct() {
        return new Magazine();
    }
}
