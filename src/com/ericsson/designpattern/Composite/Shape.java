package com.ericsson.designpattern.Composite;

/**
 * Created by eqinson on 2016/10/8.
 */
public interface Shape {

    /**
     * Draw shape on screen
     * <p>
     * Method that must be implemented by Basic as well as
     * complex shapes
     */
    public void renderShapeToScreen();

    /**
     * Making a complex shape explode results in getting a list of the
     * shapes forming this shape
     * <p>
     * For example if a rectangle explodes it results in 4 line objects
     * <p>
     * Making a simple shape explode results in returning the shape itself
     */
    public Shape[] explodeShape();

}