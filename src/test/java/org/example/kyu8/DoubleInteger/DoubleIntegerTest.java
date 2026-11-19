package org.example.kyu8.DoubleInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleIntegerTest {
    @Test
    public void shouldReturnDoubleInteger () {
        assertEquals(10, DoubleInteger.doubleInteger(5));
        assertEquals(32, DoubleInteger.doubleInteger(16));
    }

}