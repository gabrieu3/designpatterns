package com.designpatterns.composite;

import com.designpatterns.structural.composite.ProductComponent;
import com.designpatterns.structural.composite.ProductComposite;
import com.designpatterns.structural.composite.ProductLeaf;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class TestComposite {

    @Test
    void createACompositeBox(){
        Boolean equal = false;

        ProductComponent productLeaf1 = new ProductLeaf("Tesoura",5.56);
        ProductComponent productLeaf2 = new ProductLeaf("Caneta",3.36);
        ProductComponent productLeaf3 = new ProductLeaf("Lápis",1.22);
        ProductComponent productComponent = new ProductComposite();
        productComponent.add(productLeaf1);
        productComponent.add(productLeaf2);
        productComponent.add(productLeaf3);

        if(productComponent.getPrice().equals(10.14)){
            equal = true;
        }
        Assert.isTrue(equal, "Composite different price " + productComponent.getPrice());
    }
}
