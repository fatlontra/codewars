package org.example.kyu8.FirstNonConsecutive;

public class FirstNonConsecutive {
    public static Integer firstNonConsecutive (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                return arr[i];
            }
        }
        return null;
    }
}
