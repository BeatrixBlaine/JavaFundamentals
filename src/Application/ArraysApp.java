package Application;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1,3,7,8,1,2,5,6
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
