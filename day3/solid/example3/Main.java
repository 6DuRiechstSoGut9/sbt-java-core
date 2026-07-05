public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(4);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());
    }
}
