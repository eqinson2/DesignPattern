package com.ericsson.designpattern.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements Visitable {

    private String name;

    private List<Visitable> items = new ArrayList<>();

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String itemName) {
        this.name = name;
        this.addItem(new Item(itemName));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Visitable itm : items) {
            itm.accept(visitor);
        }
    }


    public void addItem(Item item) {
        items.add(item);
    }
}
