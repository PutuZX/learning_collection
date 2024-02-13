package com.enigma.collection;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> songs = new HashSet<>();
        Set<People> people = new HashSet<>();
        System.out.println(people);
        people.add(new People("Bagus", 21, 'L', "Games"));
        people.add(new People("Morin", 0, null, null));
        songs.add("Dear God");
        songs.add("Diatas Normal");
        songs.add("Kupu-kupu Malam");
        songs.add("Serba Salah");
        songs.add("Dear God");

        System.out.println(songs);
        songs.remove("Serba Salah");
        songs.remove("Dear God");
        System.out.println(songs);
    }
}
