package day5.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {
    @Test
    void addAndGet() {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    void insertByIndexAndRemove() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(1, 2);
        assertEquals(2, list.get(1));
        list.remove(0);
        assertEquals(2, list.size());
        assertEquals(2, list.get(0));
    }

    @Test
    void exceedingMaxSizeThrows() {
        LinkedList<Integer> list = new LinkedList<>(1);
        list.add(1);
        assertThrows(ListSizeExceededException.class, () -> list.add(2));
    }

    @Test
    void gettingMissingElementThrows() {
        LinkedList<Integer> list = new LinkedList<>();
        assertThrows(ElementNotFoundException.class, () -> list.get(0));
    }
}
