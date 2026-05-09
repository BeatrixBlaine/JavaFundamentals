package Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.host"));

            properties.put("hobby", "gaming");
            properties.store(new FileOutputStream("application.properties"), "New input");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        } catch (IOException e) {
            System.out.println("Gagal load data");
        }

    }
}
