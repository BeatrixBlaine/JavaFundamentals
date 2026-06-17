package Application;

import Algorithm.PrintArray;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.*;

public class TestApp {
    public static void main(String[] args) {

        HashSet<Integer> nums = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            nums.add(i + 1);
        }

        System.out.println(nums);

    }

}
