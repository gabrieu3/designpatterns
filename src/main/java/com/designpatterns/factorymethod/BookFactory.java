package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.products.Book;
import com.designpatterns.factorymethod.products.Product;

public class BookFactory extends ProductFactory{
    @Override
    public Product getProduct() {
        return new Book();
    }
}
