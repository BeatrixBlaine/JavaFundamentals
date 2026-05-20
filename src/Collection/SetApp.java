package Collection;

import EnumClass.Level;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        // Hashset stores data unordered
        Set<String> names = new HashSet<>();
        names.add("Kiya");
        names.add("Icad");
        names.add("Dina");

        for (var name : names) {
            System.out.println(name);
        }

        // Number generic, its not primitive
        // LinkedHashSet stores value ordered
        Set<Number> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(10.04);
        numbers.add(-190);
        numbers.add(100L);
        Integer x = 25;
        numbers.add(x.doubleValue());

        for (var number : numbers) {
            System.out.println(number);
        }

        // EnumSet
        Set<Level> levels = EnumSet.allOf(Level.class);

        for (var i : levels) {
            System.out.println(i);
        }

        // List is used if you need to have a same identic value
        // Set is used if you need unique elements
        // Map stores key and value (the key act as the index), almost like dictionary in python

    }
}
