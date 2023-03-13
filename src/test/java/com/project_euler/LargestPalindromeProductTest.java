package com.project_euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestPalindromeProductTest {
    @Test
    public void testIsPalindrome() {

        assertEquals(true, LargestPalindromeProduct.isPalindrome(101));
        assertEquals(false, LargestPalindromeProduct.isPalindrome(123));

    }
}
