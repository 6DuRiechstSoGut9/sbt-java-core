package day2.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixTest {
    @Test
    void add() {
        Matrix a = new Matrix(2, 2);
        a.setValue(0, 0, 1);
        a.setValue(1, 1, 2);
        Matrix b = new Matrix(2, 2);
        b.setValue(0, 0, 3);
        b.setValue(1, 1, 4);
        Matrix result = a.add(b);
        assertEquals(4, result.data[0][0], 1e-9);
        assertEquals(6, result.data[1][1], 1e-9);
    }

    @Test
    void multiplyByNumber() {
        Matrix a = new Matrix(1, 2);
        a.setValue(0, 0, 2);
        a.setValue(0, 1, 3);
        Matrix result = a.multiply(10);
        assertEquals(20, result.data[0][0], 1e-9);
        assertEquals(30, result.data[0][1], 1e-9);
    }

    @Test
    void multiplyByMatrix() {
        Matrix a = new Matrix(1, 2);
        a.setValue(0, 0, 1);
        a.setValue(0, 1, 2);
        Matrix b = new Matrix(2, 1);
        b.setValue(0, 0, 3);
        b.setValue(1, 0, 4);
        Matrix result = a.multiply(b);
        assertEquals(11, result.data[0][0], 1e-9);
    }
}
