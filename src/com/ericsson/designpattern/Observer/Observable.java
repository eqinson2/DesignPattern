package com.ericsson.designpattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    int state = 0;
    int additionalState = 0;
    List<MyObserver> obs = new ArrayList<>();

    public void updateState(int increment) {
        state = state + increment;
        notifyObservers();
    }

    private void notifyObservers() {
        for (MyObserver ob : obs)
            ob.notifyMsg("hehe");
    }

    public void subscribe(MyObserver ob) {
        obs.add(ob);
    }
}
