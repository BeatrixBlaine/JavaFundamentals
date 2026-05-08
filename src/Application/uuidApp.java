package Application;

import java.util.UUID;

public class uuidApp {
    public static void main(String[] args) {

        // Universal Unique Identifier
        for (int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
