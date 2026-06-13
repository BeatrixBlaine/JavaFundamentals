package Application;

import Algorithm.PrintArray;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.*;

public class TestApp {
    public static void main(String[] args) {

        int[] merged = new int[4];

        for (int i = 0; i < merged.length; i++) {
            merged[i] = i + 1;
        }

        int m = merged.length % 2;
        System.out.println(m);
        PrintArray.printArray(merged);

        double median = 0;
        if (merged.length % 2 == 0) {
            median = (merged[(merged.length / 2) - 1] + merged[merged.length / 2]) / 2;
        } else {
            median = merged[merged.length / 2];
        }

        double x = 5;
        double y = 2;
        double nums = x / y;
        System.out.println(median);
        System.out.println(nums);
    }

}
