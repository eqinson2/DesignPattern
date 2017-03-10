package com.ericsson.designpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

enum ProductFactory {
    instance;

    static {
        ProductFactory.instance.registerProduct("ID1", OneProduct.class);
    }

    private HashMap<String, Class> m_RegisteredProducts = new HashMap<>();

    public void registerProduct(String productID, Class productClass) {
        m_RegisteredProducts.put(productID, productClass);
    }

    public Product createProduct(String productID) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Class<?> productClass = (Class) m_RegisteredProducts.get(productID);
        Constructor productConstructor = productClass.getDeclaredConstructor(String.class);
        return (Product) productConstructor.newInstance("eqinson");
    }
}

public class Factory {
    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Product p = ProductFactory.instance.createProduct("ID1");
    }
}

abstract class Product {
    public Product(String name) {
    }
}

class OneProduct extends Product {
    public OneProduct(String name) {
        super(name);
    }
}
