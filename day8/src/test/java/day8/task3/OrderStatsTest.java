package day8.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderStatsTest {

    private final List<Order> orders = List.of(
            new Order(1, 1500, LocalDate.of(2026, 1, 10)),
            new Order(2, 3200, LocalDate.of(2026, 1, 25)),
            new Order(3, 800, LocalDate.of(2026, 2, 5)));

    @Test
    void findsMaxAndMinBySum() {
        assertEquals(2, OrderStats.maxBySum(orders).get().getId());
        assertEquals(3, OrderStats.minBySum(orders).get().getId());
    }

    @Test
    void sumsOrdersForGivenMonth() {
        assertEquals(4700.0, OrderStats.totalForMonth(orders, Month.JANUARY));
        assertEquals(800.0, OrderStats.totalForMonth(orders, Month.FEBRUARY));
    }
}
