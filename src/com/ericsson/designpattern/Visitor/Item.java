package com.ericsson.designpattern.Visitor;

public class Item implements Visitable {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}