package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofWords {
    public static void main(String[] args) {
        // Print only word with more than 5 character
        // No Lists

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                count++;
            }
        }
        String[] result = new String[count];

        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].length() > 5) {
                result[index] = arr[j];
                index++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
