package day2.task5;

public class Main {
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder("Аль-Капоне", Size.BIG, true, "Ярославская 101");
        order.order();
        order.order();
        order.cancel();
        order.cancel();
        System.out.println(order);
    }
}
