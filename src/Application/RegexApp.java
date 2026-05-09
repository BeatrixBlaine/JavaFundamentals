package Application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        // regex = regular expression

        String name = "Irsyad Ibrahim Keren";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        // matcher.find
        while (matcher.find()) {
            String result = matcher.group(); // store in result
            System.out.println(result);
        }

    }
}
