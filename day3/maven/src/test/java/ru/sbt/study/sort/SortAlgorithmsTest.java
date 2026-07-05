package ru.sbt.study.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAlgorithmsTest {

    @Test
    public void testBubbleSort() {
        SortAlgorithms sort = new SortAlgorithms();
        int[] array = {5, 3, 8, 1, 2};
        sort.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, array);
    }

    @Test
    public void testBubbleSortEmpty() {
        SortAlgorithms sort = new SortAlgorithms();
        int[] array = {};
        sort.bubbleSort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testQuickSort() {
        SortAlgorithms sort = new SortAlgorithms();
        int[] array = {9, 4, 7, 1, 6, 3};
        sort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 3, 4, 6, 7, 9}, array);
    }

    @Test
    public void testQuickSortAlreadySorted() {
        SortAlgorithms sort = new SortAlgorithms();
        int[] array = {1, 2, 3, 4, 5};
        sort.quickSort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}
