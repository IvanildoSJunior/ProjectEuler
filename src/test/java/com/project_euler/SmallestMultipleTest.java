package com.project_euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestMultipleTest {
    @Test
    public void testMdc() {

        assertEquals(3, SmallestMultiple.mdc(9,6));

        assertEquals(4, SmallestMultiple.mdc(24, 20));

        assertEquals(80, SmallestMultiple.mdc(400, 320));
        
        assertEquals(4, SmallestMultiple.mdc(16, 36));
    }
}
