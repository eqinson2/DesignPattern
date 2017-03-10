package com.ericsson.designpattern;

interface Window {
    public void renderWindow();
}

class SimpleWindow implements Window {
    @Override
    public void renderWindow() {
        // implementation of rendering details
    }
}

class DecoratedWindow implements Window {
    /**
     * private reference to the window being decorated
     */
    private Window privateWindowRefernce = null;

    public DecoratedWindow(Window windowRefernce) {
        this.privateWindowRefernce = windowRefernce;
    }

    @Override
    public void renderWindow() {
        doSomeDecoration();
        privateWindowRefernce.renderWindow();
    }

    private void doSomeDecoration() {

    }
}

class ScrollableWindow implements Window {
    /**
     * Additional State
     */
    private Window privateWindowRefernce = null;

    public ScrollableWindow(Window window) {
        this.privateWindowRefernce = window;
    }

    @Override
    public void renderWindow() {
        // render scroll bar
        renderScrollBarObject();
        privateWindowRefernce.renderWindow();
    }

    private void renderScrollBarObject() {
        // prepare scroll bar
        // render scrollbar
    }
}

public class DecoratorDemo {
    public static void main(String[] args) {
        // decorate old window
        Window window = new ScrollableWindow(new DecoratedWindow(new SimpleWindow()));
        window.renderWindow();

    }
}