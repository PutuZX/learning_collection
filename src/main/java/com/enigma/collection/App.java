package com.enigma.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Hello world!
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Arrays;;

public class App 
{
    public static void main( String[] args )
    {
        List<String> names = new ArrayList<>();
        names.add("Aditira");
        names.add("Bagus");
        names.add("Acla");
        names.add("Gina");
        names.addAll(Arrays.asList("Husna", "Reno", "Diva"));

        List<People> people = new ArrayList<>();
        people.add(new People("Bagus", 21, 'L', ""));
        people.add(new People("Micah", 24, 'L', ""));
        people.add(new People("Fio", 20, 'P', ""));
        people.add(new People("Diona", 19, 'P', ""));
        
        System.out.println();
        System.out.println(people.get(1).getName());
        for(People name : people){
            System.out.println(name.getName());
            // people.setHobbies("Cooking");
        }
        System.out.println();

        Iterator<People> iterator2 = people.iterator();

        while(iterator2.hasNext()){
            People name = iterator2.next();
            System.out.println(name);
            if(name.getName() == "Micah"){
                name.setHobbies("Cooking");
            }
            System.out.println(name);
        }

        System.out.println();

        for (People name : people){
            System.out.println(name);
        }
        System.out.println();

        
        System.out.println(names.get(1));

        System.out.println(names);
        names.set(2, "Otong");
        System.out.println(names);
        names.remove("Aditira");
        System.out.println(names);

        System.out.println("Iterating with for each loop");
        for(String name : names){
            System.out.println(name);
        }

        System.out.println("Iterating with Iterator");

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
            if(name.equals("Gina")){
                iterator.remove();
            }
        }

        System.out.println(names);
    }
}
