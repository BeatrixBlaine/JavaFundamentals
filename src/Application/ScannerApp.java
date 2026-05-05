package Application;

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.println("Hello " + nama);
    }

}
