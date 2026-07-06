package Algorithm;

public class ValidateUsername {
    public static void main(String[] args) {

        String username = "mirsyadi";
        System.out.println(validateUsername(username));

    }

    public static String validateUsername(String username) {
        // Write your code here using guard clauses
        if (username == null) return "Username cannot be null";
        if (username.isEmpty()) return "Username cannot be empty";
        if (!Character.isLetter(username.charAt(0))) return "Username must start with a letter";
        if (!username.matches("[A-Za-z0-9]+")) return "Username cannot contain special characters";
        if (username.length() < 5 || username.length() > 15) return "Username must be between 5 and 15 characters";
        return "Valid username";

    }
}
