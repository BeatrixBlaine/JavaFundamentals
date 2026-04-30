package TryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadAppWithResource {
    public static void main(String[] args) {

        // try with resource
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while (true) {
                String text = reader.readLine();
                if (text == null) {
                    break;
                }
                System.out.println(text);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
