package Application;

import Algorithm.PrintArray;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.*;

public class TestApp {

    public static void main(String[] args) {
        String studentName = "john smith";
        String[] line = studentName.split(" ");
        for (int i = 0; i < line.length; i++) {
            line[i] = line[i].substring(0,1).toUpperCase() + line[i].substring(1);
        }
        String result = String.join(" ", line);
        System.out.println(result);
    }
}
