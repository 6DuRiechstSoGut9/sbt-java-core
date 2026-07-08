package day1.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    @Test
    void palindromeNumber() {
        assertTrue(Main.isPalindrome(12321));
    }

    @Test
    void notPalindromeNumber() {
        assertFalse(Main.isPalindrome(12345));
    }

    @Test
    void singleDigitIsPalindrome() {
        assertTrue(Main.isPalindrome(7));
    }
}
