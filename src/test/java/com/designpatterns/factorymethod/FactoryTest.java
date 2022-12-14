package com.designpatterns.factorymethod;

import com.designpatterns.factorymethod.products.Book;
import com.designpatterns.factorymethod.products.Magazine;
import com.designpatterns.factorymethod.products.Product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
public class FactoryTest {

    @Test
    void createOneBook(){
        Boolean equal = false;
        com.designpatterns.factorymethod.BookFactory bookFactory = new com.designpatterns.factorymethod.BookFactory();
        Product product1 = bookFactory.getProduct();
        if(product1 instanceof Book){
            equal = true;
        }
        Assert.isTrue(equal, "Factory doesn't build a correct Book");
    }

    @Test
    void createOneMagazine(){
        Boolean equal = false;
        com.designpatterns.factorymethod.MagazineFactory magazineFactory = new com.designpatterns.factorymethod.MagazineFactory();

        Product product2 = magazineFactory.getProduct();
        if(product2 instanceof Magazine){
            equal = true;
        }
        Assert.isTrue(equal, "Factory doesn't build a correct Magazine");
    }

    @Test
    void usingAFactoryToBuilsAListOfDifferentProducts(){
        Boolean equal = false;
        AtomicInteger qtdeMagazine = new AtomicInteger();
        com.designpatterns.factorymethod.MagazineFactory magazineFactory = new com.designpatterns.factorymethod.MagazineFactory();
        com.designpatterns.factorymethod.BookFactory bookFactory = new com.designpatterns.factorymethod.BookFactory();
        List<Product> shoppingCart = new ArrayList<>();
        for(int i = 1; i < 20; i++){
            if(i%3==0){
                shoppingCart.add(magazineFactory.getProduct());
            }else{
                shoppingCart.add(bookFactory.getProduct());
            }
        }

        shoppingCart.forEach(product ->{
            if(product instanceof Magazine){
                qtdeMagazine.getAndIncrement();
            }
        });

        if(qtdeMagazine.get() == 6){
            equal = true;
        }
        Assert.isTrue(equal, "Factory doesn't build a correct ArrayList, qtde: "+ qtdeMagazine.get() );
    }


}
