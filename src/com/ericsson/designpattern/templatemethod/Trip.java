package com.ericsson.designpattern.templatemethod;

class TemplateMethod {
    public static void main(String... args) {
        new PackageA().performTrip();
        new PackageB().performTrip();
    }
}

public abstract class Trip {
    public final void performTrip() {
        doComingTransport();
        doDayA();
        doDayB();
        doDayC();
        doReturningTransport();
    }

    void f() {
    }

    protected abstract void doComingTransport();

    protected abstract void doDayA();

    protected abstract void doDayB();

    protected abstract void doDayC();

    protected abstract void doReturningTransport();
}

class PackageA extends Trip {
    protected void doComingTransport() {
        f();
        System.out.println("The turists are comming by air ...");
    }

    protected void doDayA() {
        System.out.println("The turists are visiting the aquarium ...");
    }

    protected void doDayB() {
        System.out.println("The turists are going to the beach ...");
    }

    protected void doDayC() {
        System.out.println("The turists are going to mountains ...");
    }

    protected void doReturningTransport() {
        System.out.println("The turists are going home by air ...");
    }
}

class PackageB extends Trip {
    protected void doComingTransport() {
        System.out.println("The turists are comming by train ...");
    }

    protected void doDayA() {
        System.out.println("The turists are visiting the mountain ...");
    }

    protected void doDayB() {
        System.out.println("The turists are going to the beach ...");
    }

    protected void doDayC() {
        System.out.println("The turists are going to zoo ...");
    }

    protected void doReturningTransport() {
        System.out.println("The turists are going home by train ...");
    }
}
