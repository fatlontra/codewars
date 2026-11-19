package org.example.kyu8.RemoveElements;

public class RemoveSecondElement {
    public static Object[] removeEveryOther(Object[] arr) {
        Object[] newElements = new Object[(arr.length + 1) / 2];

        for (int n = 0; n < arr.length; n += 2) {
            newElements[n / 2] = arr[n];
        }
        return newElements;
    }
}
