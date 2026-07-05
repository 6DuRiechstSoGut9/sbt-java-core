public class Square extends Rectangle {
    public Square(Point point, double side) {
        super(point, side, side);
    }

    public void draw(Color color) {
        System.out.println("Нарисован квадрат цвета " + color + " с координатами " + point + ", сторона " + width);
    }
}
