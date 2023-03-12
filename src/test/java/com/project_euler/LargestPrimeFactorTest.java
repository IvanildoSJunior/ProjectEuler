package com.project_euler;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class LargestPrimeFactorTest {
    
    LargestPrimeFactor prime = new LargestPrimeFactor();    

    @Test
    public void testGetFirstPrimeFactor() {

        assertEquals(2, prime.getFirstPrimeFactor(10));
        assertEquals(3, prime.getFirstPrimeFactor(15));
    }

}
