package it.unibo.shapes.impl;
import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {
    private static final int EDGES = 4;
    private final double l1;
    private final double l2;

    public Rectangle(final double l1, final double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double area() {
        return this.l1 * this.l2;
    }

    @Override
    public double perimeter() {
        return (this.l1 + this.l2) * 2;
    }

    @Override
    public int getEdgeCount() {
        return EDGES;
    }
}
