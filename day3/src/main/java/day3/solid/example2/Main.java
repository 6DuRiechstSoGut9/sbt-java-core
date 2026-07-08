package day3.solid.example2;

public class Main {
    public static void main(String[] args) {
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        System.out.println("Площадь круга: " + calculator.calculateArea(new Circle(5)));
        System.out.println("Площадь прямоугольника: " + calculator.calculateArea(new Rectangle(4, 6)));
        System.out.println("Площадь треугольника: " + calculator.calculateArea(new Triangle(3, 8)));
    }
}
