package Application;

import Algorithm.PrintArray;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.*;

public class TestApp {
    public static void main(String[] args) {
        String s = "aaabbcda";
        System.out.println(s.substring(0,8));
        System.out.println(s.substring(0,2));
        System.out.println(s.length());

        String[] line = s.split("");
        int[] counted = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            int count = 1;
            boolean found = false;

            for (int j = i + 1; j < line.length; j++) {
                if (!line[i].equals(line[j])) {
                    count++;
                } else {
                    counted[i] = count;
                    found = true;
                    break;
                }
            }

            if (!found) {
                counted[i] = count;
            }
        }

        int max = counted[0];
        for (int i = 1; i < counted.length; i++) {
            if (max < counted[i]) {
                max = counted[i];
            }
        }

        System.out.println(max);

    }

}
