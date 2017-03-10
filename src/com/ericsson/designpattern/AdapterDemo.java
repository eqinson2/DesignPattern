package com.ericsson.designpattern;

interface Target {
    void Request();
}

/**
 * Created by eqinson on 2016/10/7.
 */
public class AdapterDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        f(new Adapter());
    }

    public static void f(Target target) {
        target.Request();
    }
}

class Adaptee {
    void SpecificRequst() {
        System.out.println("Adaptee's SpecificRequst");
    }
}

class Adapter extends Adaptee implements Target {
    @Override
    public void Request() {
        System.out.println("Adapter's Request");
        super.SpecificRequst();
    }

}