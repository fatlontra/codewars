package org.example.kyu8.RemoveElements;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemoveSecondElementTest {
    @Test
    public void shouldReturnNewElements() {
        assertArrayEquals(new Object[]{1, 3 ,5 ,7}, RemoveSecondElement.removeEveryOther(new Object[]{1,2,3,4,5,6,7,8}));
    }
}
