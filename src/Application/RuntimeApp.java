package Application;

import java.io.IOException;

public class RuntimeApp {
    public static void main(String[] args) {

        try {
            Runtime runtime = Runtime.getRuntime();

            String[] cmd = {"notepad.exe"};
            long bytes = runtime.totalMemory();
            double GB = bytes / (1024.0 * 1024 * 1024);

            System.out.println(runtime.availableProcessors());
            System.out.println(runtime.totalMemory() + " bytes");
            System.out.println(runtime.freeMemory());
            System.out.println(GB + " GB");

            // execute notepad
            runtime.exec(cmd);


        } catch (IOException exception) {
            System.out.println("File tidak bisa di load!");
        }


    }
}
