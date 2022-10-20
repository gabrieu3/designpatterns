package com.designpatterns.factory;

import com.designpatterns.factory.products.Magazine;
import com.designpatterns.factory.products.Product;

public class MagazineFactory extends ProductFactory{
    @Override
    public Product getProduct() {
        return new Magazine();
    }
}
