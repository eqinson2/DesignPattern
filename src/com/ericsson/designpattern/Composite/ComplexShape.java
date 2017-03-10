package com.ericsson.designpattern.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eqinson on 2016/10/8.
 */
public class ComplexShape implements Shape {
    /**
     * List of shapes
     */
    List<Shape> shapeList = new ArrayList<>();

    /**
     *
     */
    public void addToShape(Shape shapeToAddToCurrentShape) {
        shapeList.add(shapeToAddToCurrentShape);
    }


    public Shape[] explodeShape() {
        return (Shape[]) shapeList.toArray();
    }

    /**
     * this method is implemented directly in basic shapes
     * in complex shapes this method is handled with delegation
     */
    public void renderShapeToScreen() {
        for (Shape s : shapeList) {
            // use delegation to handle this method
            s.renderShapeToScreen();

        }
    }
}
