package com.ericsson.designpattern;

interface Product2 {
}

public class FactoryMethod {
}

abstract class Creator {
    public Product2 create() {
        return factoryMethod();
    }

    protected abstract Product2 factoryMethod();
}

class ConcreteProduct implements Product2 {
}

class ConcreteCreator extends Creator {
    protected Product2 factoryMethod() {
        return new ConcreteProduct();
    }
}

class Client {
    public static void main(String arg[]) {
        Creator creator = new ConcreteCreator();
        creator.create();
    }
}