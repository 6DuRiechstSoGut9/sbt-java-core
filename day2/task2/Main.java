public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "красный");
        System.out.println(circle);
        System.out.println("Площадь: " + circle.area());
        System.out.println("Периметр: " + circle.perimeter());
    }
}
