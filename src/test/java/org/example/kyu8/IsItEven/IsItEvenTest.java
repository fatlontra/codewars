package org.example.kyu8.IsItEven;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsItEvenTest {
    private IsItEven isItEven = new IsItEven();

    @Test
    public void shouldReturnBooleanForEven () {
        assertFalse(isItEven.isEven(1));
        assertTrue(isItEven.isEven(2));
        assertFalse(isItEven.isEven(2.91));
        assertTrue(isItEven.isEven(-32));
        assertTrue(isItEven.isEven(0));
    }

}