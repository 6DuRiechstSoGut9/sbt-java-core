package day2.task2;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Круг: радиус " + radius + ", цвет " + color + ", площадь " + area() + ", периметр " + perimeter();
    }
}
