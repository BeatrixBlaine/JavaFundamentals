package Exception;

import RecordClass.LoginRequest;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username tidak boleh null!");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleh kosong!");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password tidak boleh null!");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh kosong!");
        }
    }
}
