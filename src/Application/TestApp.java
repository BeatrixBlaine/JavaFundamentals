package Application;

import Algorithm.PrintArray;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.*;

public class TestApp {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = map;

        map2.put(2, "Icad");

        System.out.println(map2.get(2));
    }

}
