package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("war", 2.0, 3.0, true));
        stamps.add(new Stamp("war", 2.0, 3.0, true));
        stamps.add(new Stamp("gdy", 2.0, 2.0, false));
        stamps.add(new Stamp("gdy", 2.0, 2.0, false));

        System.out.println(stamps.size());
        for (Stamp stamp :
                stamps) {
            System.out.println(stamp.toString());
        }
    }
}
