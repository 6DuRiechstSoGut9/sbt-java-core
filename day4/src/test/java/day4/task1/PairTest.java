package day4.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairTest {
    @Test
    void keyAndValue() {
        Pair<String, Integer> pair = new Pair<>("возраст", 25);
        assertEquals("возраст", pair.getKey());
        assertEquals(25, pair.getValue());
    }

    @Test
    void setters() {
        Pair<String, Integer> pair = new Pair<>("a", 1);
        pair.setKey("b");
        pair.setValue(2);
        assertEquals("b", pair.getKey());
        assertEquals(2, pair.getValue());
    }

    @Test
    void toStringFormat() {
        Pair<String, Integer> pair = new Pair<>("x", 10);
        assertEquals("x = 10", pair.toString());
    }
}
