package day2.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    @Test
    void area() {
        Circle circle = new Circle(2, "красный");
        assertEquals(Math.PI * 4, circle.area(), 1e-9);
    }

    @Test
    void perimeter() {
        Circle circle = new Circle(3, "синий");
        assertEquals(2 * Math.PI * 3, circle.perimeter(), 1e-9);
    }
}
