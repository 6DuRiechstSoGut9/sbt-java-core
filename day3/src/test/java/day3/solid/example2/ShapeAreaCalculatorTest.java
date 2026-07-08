package day3.solid.example2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeAreaCalculatorTest {
    private final ShapeAreaCalculator calculator = new ShapeAreaCalculator();

    @Test
    void rectangleArea() {
        assertEquals(12, calculator.calculateArea(new Rectangle(3, 4)), 1e-9);
    }

    @Test
    void circleArea() {
        assertEquals(Math.PI * 4, calculator.calculateArea(new Circle(2)), 1e-9);
    }
}
