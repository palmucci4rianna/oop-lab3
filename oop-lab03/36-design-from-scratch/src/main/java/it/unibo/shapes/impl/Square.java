package it.unibo.shapes.impl;
import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public int getEdgeCount() {
        return 4;
    }
}