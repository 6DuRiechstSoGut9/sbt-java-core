package day2.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PizzaOrderTest {
    @Test
    void toStringContainsSizeAndName() {
        PizzaOrder order = new PizzaOrder("Маргарита", Size.BIG, true, "ул. Ленина 1");
        String text = order.toString();
        assertTrue(text.contains("Большая"));
        assertTrue(text.contains("Маргарита"));
        assertTrue(text.contains("с соусом"));
    }

    @Test
    void settersUpdateFields() {
        PizzaOrder order = new PizzaOrder("Маргарита", Size.SMALL, false, "адрес");
        order.setName("Пепперони");
        order.setSize(Size.MEDIUM);
        assertEquals("Пепперони", order.getName());
        assertEquals(Size.MEDIUM, order.getSize());
    }
}
