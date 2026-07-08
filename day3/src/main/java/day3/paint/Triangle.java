package day3.paint;

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(Point point, double a, double b, double c) {
        super(point);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.println("Нарисован треугольник цвета " + color + " с координатами " + point + ", стороны " + a + ", " + b + ", " + c);
    }
}
