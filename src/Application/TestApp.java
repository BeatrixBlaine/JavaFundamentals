package Application;

import Algorithm.PrintArray;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.*;

public class TestApp {
    public static void main(String[] args) {

        String[] operations = {
                "ADD Keyboard 30",
                "ADD Mouse 30"
        };

        String[] op = operations[0].split(" ");

        PrintArray.printArray(op);

        System.out.println(op[2]);

    }

}
