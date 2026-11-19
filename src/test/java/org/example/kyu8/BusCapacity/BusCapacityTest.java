package org.example.kyu8.BusCapacity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusCapacityTest {
    @Test
    public void shouldReturnPassengersNotOnBoard () {
        assertEquals(0, BusCapacity.enough(10,5,5));
        assertEquals(10, BusCapacity.enough(20,20,20));
    }
}
