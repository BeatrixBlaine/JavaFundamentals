package RecordClass;

public record LoginRequest(String username, String password) {

    // constructor
    public LoginRequest {
        System.out.println("User logged in");
    }

    // constructor overloading
    public LoginRequest(String username) {
        this(username, "");
    }

    // try method
    public void showInfo(LoginRequest loginRequest) {
        System.out.println(loginRequest);
    }

    // method 2
    public void showInfo2() {
        System.out.println(new LoginRequest("Icad", "12345"));
    }
}
