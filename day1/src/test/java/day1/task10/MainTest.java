package day1.task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void convertsSimpleNumber() {
        assertEquals("X", Main.toRoman(10));
    }

    @Test
    void convertsSubtractiveNumber() {
        assertEquals("XCIV", Main.toRoman(94));
    }

    @Test
    void convertsCompoundNumber() {
        assertEquals("LXXVII", Main.toRoman(77));
    }
}
