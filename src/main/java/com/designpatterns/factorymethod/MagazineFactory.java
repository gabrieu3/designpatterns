package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.products.Magazine;
import com.designpatterns.factorymethod.products.Product;

public class MagazineFactory extends ProductFactory{
    @Override
    public Product getProduct() {
        return new Magazine();
    }
}
