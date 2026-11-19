package org.example.kyu8.Grade;

public class Grade {
    public static char getGrade (int s1, int s2, int s3) {
        Integer averageScore = (s1 + s2 + s3) / 3;

        if (averageScore >= 90) return 'A';
        if (averageScore >= 80) return 'B';
        if (averageScore >= 70) return 'C';
        if (averageScore >= 60) return 'D';
        return 'F';
        }

    }

