package org.example.kyu8.FirstNonConsecutive;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstNonConsecutiveTest {
    @Test
     public void shouldReturnFirstNonConsecutive() {
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.firstNonConsecutive(new int[]{1,2,3,4,6,7,8}));
    }
    @Test
    public void shouldReturnNull () {
        assertEquals(null, FirstNonConsecutive.firstNonConsecutive(new int []{1,2,3,4,5,6}));
    }
}
