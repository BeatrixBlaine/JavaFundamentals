package Algorithm;


import java.util.StringTokenizer;

public class StringToken {

    public static void main(String[] args) {

        System.out.println(tokenizeText("Hello World",null));

    }

    public static String tokenizeText(String text, String delimiter) {
        // Write your code here
        if (text == null) return "Invalid text";
        if (delimiter == null) {
            delimiter = " ";
        }

        StringTokenizer st = new StringTokenizer(text, delimiter);
        StringBuilder result = new StringBuilder();
        int count = st.countTokens();

        result.append("Token count: " + count);
        result.append("\n");

        while(st.hasMoreTokens()) {
            result.append("Token: ");
            result.append(st.nextToken());
            result.append("\n");
        }

        return result.toString();
    }

}


