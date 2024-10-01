package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();

        stamps.add(new Stamp("Butterflies", 1.25, 2.0, true));
        stamps.add(new Stamp("Gdańsk", 1.25, 2.0, true));
        stamps.add(new Stamp("Zakopane", 0.75, 1.0, false));
        stamps.add(new Stamp("Zakopane", 0.75, 1.0, false));

        System.out.println("size: " + stamps.size());

        for(Stamp stamp : stamps )
            System.out.println(stamp);
    }
}
