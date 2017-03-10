package com.ericsson.designpattern.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Visitable {

    private String name;

    private List<Visitable> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);

        for (Visitable visitable : orders) {
            visitable.accept(visitor);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}