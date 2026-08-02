package Algorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWords {
    public static void main(String[] args) {
        System.out.println(findWords("Cita dan Icad", "Icad"));
    }

    public static String findWords(String text, String word) {
        // Write your code here
        if (text == null || word == null) return "Invalid input";
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.start()).append(" ");
        }

        if (sb.length() == 0) {
            return "Not found";
        }

        return sb.toString();
    }
}
