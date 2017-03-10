package com.ericsson.designpattern.templatemethod.sub;

import com.ericsson.designpattern.templatemethod.Trip;

public class PackageC extends Trip {
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

    protected void doComingTransport() {
        System.out.println("The turists are comming by air ...");
    }
}
