package Exception;

import RecordClass.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest(null,null);

        // Exception
        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Always executed!");
        }

        /* Or you can do this :
        *
        * catch (ValidationException | NullPointerException e) {}s
        *
        * no limit in adding exception with this method, you can add another exception by | again
        * */

        // Runtime Exception
        LoginRequest loginRequest1 = new LoginRequest("Icad", "12345");
        ValidationUtil.validateRuntime(loginRequest1);


    }
}
