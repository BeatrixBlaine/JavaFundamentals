package Exception;

public class DatabaseApp {

    public static void main(String[] args) {
        connectDatabase(null,"1234");
        System.out.println("Success!");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Can't connect to database");
        }
    }

}
