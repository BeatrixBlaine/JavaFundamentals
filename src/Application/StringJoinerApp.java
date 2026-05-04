package Application;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[","]");

        joiner.add("Icad");
        joiner.add("Sarah");
        joiner.add("Maslin");

        String value = joiner.toString();
        System.out.println(value);

    }
}
