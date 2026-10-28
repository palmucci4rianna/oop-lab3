package it.unibo.shapes.test;
import it.unibo.shapes.api.Polygon;
import it.unibo.shapes.api.Shape;
import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public final class WorkWithShapes {
    private static String shapeDetails(final Shape s) {
        return "Perimeter = " + s.perimeter() + ", area = " + s.area();
    }
    public static void main(final String[] args){
        final Shape c = new Circle(10);
        System.out.println("Circle: " + shapeDetails(c));

        final Polygon t = new Triangle(3, 4, 5);
        System.out.println("Triangle: " + shapeDetails(t) + ", edges = " + t.getEdgeCount());

        final Polygon r = new Rectangle(4, 5);
        System.out.println("Rectangle: " + shapeDetails(r) + ", edges = " + r.getEdgeCount());

        final Polygon s = new Square(6);
        System.out.println("Square: " + shapeDetails(s) + ", edges = " + s.getEdgeCount());
    }
}