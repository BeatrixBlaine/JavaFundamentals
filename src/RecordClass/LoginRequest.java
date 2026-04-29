package RecordClass;

public record LoginRequest(String username, String password) {

    // constructor
    public LoginRequest {
        if (username == null || password == null) {
            System.out.println("Please fill the username or password correctly!");
        } else if (username.isBlank() || password.isBlank() ) {
            System.out.println("Please fill the username or password correctly!");
        } else {
            System.out.println("User Signed In");
        }
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
