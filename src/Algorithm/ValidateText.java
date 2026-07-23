package Algorithm;

public class ValidateText {
    public static void main(String[] args) {

        String text = "12345";
        String type = "number";

        System.out.println(validateInput(text, type));

    }

    public static String validateInput(String text, String type) {
        // Write your code here
        if (text == null) {
            return "Invalid input";
        }
        switch (type) {
            case "number":
                if (text.matches("[0-9]+")) {
                    return "Valid";
                }
                return "Invalid";
            case "word":
                if (text.matches("[a-zA-Z]+")) {
                    return "Valid";
                }
                return "Invalid";
            case "email":
                if (text.matches("^[^@]+@.+$")) {
                    return "Valid";
                }
                return "Invalid";
            case "phone":
                if (text.length() == 10 && text.matches("[0-9]+")) {
                    return "Valid";
                }
                return "Invalid";
            default:
                return "Invalid type";
        }
    }
}
