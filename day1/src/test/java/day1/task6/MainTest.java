package day1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    @Test
    void primeNumber() {
        assertTrue(Main.isPrime(13));
    }

    @Test
    void compositeNumber() {
        assertFalse(Main.isPrime(15));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(Main.isPrime(1));
    }
}
