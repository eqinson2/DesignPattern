package com.ericsson.designpattern;

enum SingletonDemo2 {
    instance;
}

/**
 * Created by eqinson on 2016/10/7.
 */
public class SingletonDemo {
    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static SingletonDemo instance = new SingletonDemo();
    }
}
