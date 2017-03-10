package com.ericsson.designpattern.Visitor;

public interface Visitable {
    public void accept(Visitor visitor);
}
