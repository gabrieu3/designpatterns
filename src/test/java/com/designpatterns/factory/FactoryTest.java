package com.designpatterns.factory;

import com.designpatterns.factory.products.Book;
import com.designpatterns.factory.products.Magazine;
import com.designpatterns.factory.products.Product;
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
        BookFactory bookFactory = new BookFactory();
        Product product1 = bookFactory.getProduct();
        if(product1 instanceof Book){
            equal = true;
        }
        Assert.isTrue(equal, "Factory doesn't build a correct Book");
    }

    @Test
    void createOneMagazine(){
        Boolean equal = false;
        MagazineFactory magazineFactory = new MagazineFactory();

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
        MagazineFactory magazineFactory = new MagazineFactory();
        BookFactory bookFactory = new BookFactory();
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
