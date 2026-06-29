package Collection;

import Algorithm.PrintArray;
import EnumClass.Level;
import InitialFundamentals.Person;

import java.util.*;

public class SetApp {
    public static void main(String[] args) {

        // Hashset stores data unordered
        Set<String> names = new HashSet<>();
        names.add("Kiya");
        names.add("Icad");
        names.add("Dina");

        HashSet<String> test = new HashSet<>();

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

        // SortedSet
        SortedSet<Integer> nums = new TreeSet<>();
        nums.add(3);
        nums.add(10);
        nums.add(7);

        // Auto sort (Ascending)
        PrintArray.printArray(nums);
        // method for descending order only available in NavigableSet not SortedSet
        NavigableSet<Integer> nav = (NavigableSet<Integer>) nums; // Cast to NavigableSet
        PrintArray.printArray(nav.descendingSet());

        // List is used if you need to have a same identic value
        // Set is used if you need unique elements
        // Map stores key and value (the key act as the index), almost like dictionary in python

    }


}
