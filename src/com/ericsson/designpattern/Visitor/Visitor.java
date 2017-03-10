package com.ericsson.designpattern.Visitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Visitor {
    protected abstract void visit(Customer customer);

    protected abstract void visit(Order order);

    protected abstract void visit(Item item);

    public void visit(Object object) {
        try {
            Method downPolymorphic = object.getClass().getMethod("visit",
                    object.getClass());

            if (downPolymorphic == null) {
                defaultVisit(object);
            } else {
                downPolymorphic.invoke(this, object);
            }
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            this.defaultVisit(object);
        }
    }

    public void defaultVisit(Object object) {
        System.out.println("default visit: " + object.getClass().getSimpleName());
    }
}

class GeneralReport extends Visitor {
    private int customersNo;
    private int ordersNo;
    private int itemsNo;

    @Override
    protected void visit(Customer customer) {
        System.out.println(customer.getName());
        customersNo++;
    }

    @Override
    protected void visit(Order order) {
        System.out.println(order.getName());
        ordersNo++;
    }

    @Override
    protected void visit(Item item) {
        System.out.println(item.getName());
        itemsNo++;
    }

    public void displayResults() {
        System.out.println("Nr of customers:" + customersNo);
        System.out.println("Nr of orders:   " + ordersNo);
        System.out.println("Nr of itemss:   " + itemsNo);
    }
}
