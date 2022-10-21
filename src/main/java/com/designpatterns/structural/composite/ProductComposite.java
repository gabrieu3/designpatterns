package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductComposite extends ProductComponent {

    List<ProductComponent> children;

    public ProductComposite() {
        this.children = new ArrayList<>();
    }

    @Override
    public void add(ProductComponent component) {
        this.children.add(component);
    }

    @Override
    public void remove(ProductComponent component) {
        this.children.remove(component);
    }

    @Override
    public Double getPrice() {
        Double price = 0.0;
        for (ProductComponent child : this.children) {
            price += child.getPrice();
        }
        return price;
    }
}
