package org.example.kyu8.BusCapacity;

public class BusCapacity {
    public static int enough (int cap, int on, int wait) {
        if (cap - on < wait) return wait - (cap - on);
        return 0;
    }
}
