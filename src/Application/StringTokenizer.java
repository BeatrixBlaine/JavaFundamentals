package Application;

public class StringTokenizer {
    public static void main(String[] args) {
        String name = "Irsyad,Ibrahim";
        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(name, ",");

        // Split the string, if delimiter "," found in the variable
        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
