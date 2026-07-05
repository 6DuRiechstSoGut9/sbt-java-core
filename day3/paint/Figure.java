public abstract class Figure implements Drawable {
    Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public abstract double area();

    public abstract double perimeter();
}
