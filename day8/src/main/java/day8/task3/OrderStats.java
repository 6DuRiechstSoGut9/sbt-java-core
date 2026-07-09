package day8.task3;

import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OrderStats {
    public static Optional<Order> maxBySum(List<Order> orders) {
        return orders.stream().max(Comparator.comparingDouble(Order::getSum));
    }

    public static Optional<Order> minBySum(List<Order> orders) {
        return orders.stream().min(Comparator.comparingDouble(Order::getSum));
    }

    public static double totalForMonth(List<Order> orders, Month month) {
        return orders.stream()
                .filter(o -> o.getDate().getMonth() == month)
                .mapToDouble(Order::getSum)
                .sum();
    }
}
