public class PaintExample {
    public static void main(String[] args) {
        Figure circle = new Circle(new Point(0, 0), 5);
        Figure rectangle = new Rectangle(new Point(1, 2), 4, 6);
        Figure square = new Square(new Point(3, 3), 4);
        Figure triangle = new Triangle(new Point(0, 5), 3, 4, 5);

        FigureUtil.draw(circle);
        FigureUtil.draw(rectangle, Color.RED);
        FigureUtil.draw(square, Color.BLUE);
        FigureUtil.draw(triangle, Color.GREEN);

        System.out.println("Площадь круга: " + FigureUtil.area(circle));
        System.out.println("Периметр круга: " + FigureUtil.perimeter(circle));
        System.out.println("Площадь треугольника: " + FigureUtil.area(triangle));
    }
}
