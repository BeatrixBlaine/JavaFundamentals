package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Isomorphism {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,4,3,2,1};

        String[] x = {"a","b","c","d"};
        String[] y = {"d","c","b","a"};

        System.out.println(isIsomorph(array1,array2));
        System.out.println(isIsomorph(x,y));

    }

    public static boolean isIsomorph(int[] array1, int[] array2) {
        // check if the array length is same
        if (array1.length != array2.length) {
            return false;
        }

        // HashMap declaration
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        // for loop to input value to HashMap, and Isomorphism logic
        for (int i = 0; i < array1.length; i++) {
            int value1 = array1[i];
            int value2 = array2[i];

            // check map1 key value, is it contain value2? if not put value1 as key and value2 as the value
            if (map1.containsKey(value1)) {
                if (map1.get(value1) != value2) {
                    return false;
                }
            } else {
                map1.put(value1, value2);
            }

            // check map2 key value, is it contain value1? if not put value2 as key and value1 as the value
            if (map2.containsKey(value2)) {
                if (map2.get(value2) != value1) {
                    return false;
                }
            } else {
                map2.put(value2, value1);
            }
        }

        return true;
    }

    public static boolean isIsomorph(String[] array1, String[] array2) {
        // check if the array length is same
        if (array1.length != array2.length) {
            return false;
        }

        // HashMap declaration
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        // for loop to input value to HashMap, and Isomorphism logic
        for (int i = 0; i < array1.length; i++) {
            String value1 = array1[i];
            String value2 = array2[i];

            // check map1 key value, is it contain value2? if not put value1 as key and value2 as the value
            if (map1.containsKey(value1)) {
                if (map1.get(value1).equals(value2)) {
                    return false;
                }
            } else {
                map1.put(value1, value2);
            }

            // check map2 key value, is it contain value1? if not put value2 as key and value1 as the value
            if (map2.containsKey(value2)) {
                if (map2.get(value2).equals(value1)) {
                    return false;
                }
            } else {
                map2.put(value2, value1);
            }
        }

        return true;
    }
}
