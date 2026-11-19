package org.example.kyu8.CalculateCubeVolumeTest;

import org.example.kyu8.CalculateCubeVolume.CalculateCubeVolume;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateCubeVolumeTest {
    @Test
    public void shouldReturnCubeVolume () {
        assertEquals(27, CalculateCubeVolume.getVolumeOfCuboid(3,3,3));
    }
}
