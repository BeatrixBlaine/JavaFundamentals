package Application;

import java.util.Base64;

public class BaseApp {
    public static void main(String[] args) {

        String original = "Irsyad Ibrahim";

        // bytes
        System.out.println(original.getBytes());

        // encoder
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        // decode (stored in byte array data type)
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);
        System.out.println(result);

    }
}
