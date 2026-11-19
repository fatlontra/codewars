package org.example.kyu8.Grade;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeTest {

    @Test
    public void shouldReturnGrades () {
        assertEquals('A', Grade.getGrade(81,90,100));
        assertEquals('B', Grade.getGrade(80,80,80));
        assertEquals('C', Grade.getGrade(71,71,73));
        assertEquals('D', Grade.getGrade(63,69,69));
        assertEquals('F', Grade.getGrade(0,51,98));
    }
}
