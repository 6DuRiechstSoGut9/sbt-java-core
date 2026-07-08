package day7.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpaceRemoverTest {

    @Test
    void collapsesMultipleSpaces() {
        assertEquals("Москва спаленная пожаром", SpaceRemover.removeExtraSpaces("Москва    спаленная     пожаром"));
    }

    @Test
    void trimsLeadingAndTrailingSpaces() {
        assertEquals("текст", SpaceRemover.removeExtraSpaces("   текст   "));
    }

    @Test
    void keepsSingleSpaces() {
        assertEquals("а б в", SpaceRemover.removeExtraSpaces("а б в"));
    }
}
