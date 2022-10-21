package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.products.Book;
import com.designpatterns.creational.factorymethod.products.Product;

public class BookFactory extends ProductFactory{
    @Override
    public Product getProduct() {
        return new Book();
    }
}
