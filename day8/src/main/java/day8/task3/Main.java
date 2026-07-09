package day8.task3;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, 1500, LocalDate.of(2026, 1, 10)),
                new Order(2, 3200, LocalDate.of(2026, 1, 25)),
                new Order(3, 800, LocalDate.of(2026, 2, 5)),
                new Order(4, 2100, LocalDate.of(2026, 2, 18)));

        System.out.println("Максимальный заказ: " + OrderStats.maxBySum(orders).get());
        System.out.println("Минимальный заказ: " + OrderStats.minBySum(orders).get());
        System.out.println("Сумма за январь: " + OrderStats.totalForMonth(orders, Month.JANUARY));
    }
}
