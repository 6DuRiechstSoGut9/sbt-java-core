package day3.paint;

public class Circle extends Figure {
    double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.println("Нарисован круг цвета " + color + " с центром в точке " + point + " и радиусом " + radius);
    }
}
