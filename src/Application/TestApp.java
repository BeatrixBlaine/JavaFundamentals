package Application;

import Algorithm.PrintArray;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.*;

public class TestApp {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(5);
        set2.add(6);

        HashSet<Integer> newSet = new HashSet<>(set1);
        newSet.addAll(set2);
        System.out.println(newSet);

        HashSet<Integer> newSet1 = new HashSet<>(set1);
        newSet1.removeAll(set2);
        System.out.println(newSet1);

        HashSet<Integer> newSet2 = new HashSet<>(set1);
        newSet1.retainAll(set2);
        System.out.println(newSet2);

        System.out.println(set1.size());


    }

}
