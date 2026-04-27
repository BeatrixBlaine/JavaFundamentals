package RecordClass;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Irsyad", "12345");
        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest("Sarah"));
        System.out.println("------------");
        loginRequest.showInfo(loginRequest);
        System.out.println("------------");
        loginRequest.showInfo2();
        System.out.println("------------");
        LoginRequest loginRequest1 = new LoginRequest("Dina","12345");
        loginRequest.showInfo(loginRequest1);

    }
}
