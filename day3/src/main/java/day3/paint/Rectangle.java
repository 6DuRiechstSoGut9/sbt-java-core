package day3.paint;

public class Rectangle extends Figure {
    double width;
    double height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public void draw() {
        draw(Color.BLACK);
    }

    public void draw(Color color) {
        System.out.println("Нарисован прямоугольник цвета " + color + " с координатами " + point + ", ширина " + width + ", высота " + height);
    }
}
