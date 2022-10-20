package com.designpatterns.factory;

import com.designpatterns.factory.products.Book;
import com.designpatterns.factory.products.Product;

public class BookFactory extends ProductFactory{
    @Override
    public Product getProduct() {
        return new Book();
    }
}
