package Exception;

import RecordClass.LoginRequest;

public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new ValidationException("Username tidak boleh null!");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username tidak boleh kososng!");
        } else if (loginRequest.password() == null) {
            throw new ValidationException("Password tidak boleh null!");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password tidak boleh kososng!");
        }
    }
}
