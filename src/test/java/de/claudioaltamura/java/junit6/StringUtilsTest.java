package de.claudioaltamura.java.junit6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"), "madam should be a palindrome");
    }

    @Test
    void isNotPalindrome() {
        assertFalse(StringUtils.isPalindrome("hello"), "hello should not be a palindrome");
    }
}