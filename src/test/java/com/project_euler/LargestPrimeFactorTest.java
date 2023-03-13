package com.project_euler;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class LargestPrimeFactorTest {

    @Test
    public void testGetFirstPrimeFactor() {

        assertEquals(2, LargestPrimeFactor.getFirstPrimeFactor(10));
        assertEquals(3, LargestPrimeFactor.getFirstPrimeFactor(15));

        
    }

    @Test
    public void testGetLargestPrimeFactor(){

        assertEquals(6857, LargestPrimeFactor.getLargestPrimeFactor(600851475143L));
    }

}
