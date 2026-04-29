package Exception;

import RecordClass.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null,null);

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }

    }
}
