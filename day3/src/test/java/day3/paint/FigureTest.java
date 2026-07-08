package day3.paint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FigureTest {
    @Test
    void rectangleArea() {
        Rectangle rectangle = new Rectangle(new Point(0, 0), 4, 5);
        assertEquals(20, rectangle.area(), 1e-9);
    }

    @Test
    void circlePerimeter() {
        Circle circle = new Circle(new Point(0, 0), 2);
        assertEquals(2 * Math.PI * 2, circle.perimeter(), 1e-9);
    }

    @Test
    void triangleArea() {
        Triangle triangle = new Triangle(new Point(0, 0), 3, 4, 5);
        assertEquals(6, triangle.area(), 1e-9);
    }
}
