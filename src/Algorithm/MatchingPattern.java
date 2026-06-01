package Algorithm;

import java.util.Scanner;

public class MatchingPattern {
    public static boolean check(String[] arr, String[] pattern) {
        if (pattern.length > arr.length) {
            return false;
        }
        for (int i = 0; i <= arr.length - pattern.length; i++) {
            boolean match = true;

            for (int j = 0; j < pattern.length; j++) {
                if(!arr[i + j].equals(pattern[j])) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrString1 = scanner.nextLine();
        String arrString2 = scanner.nextLine();
        String[] str1 = arrString1.split(",");
        String[] str2 = arrString2.split(",");
        // Write your code below


        System.out.println(check(str1, str2));
    }
}
