package Application;

public class SystemApp {
    public static void main(String[] args) {

        // System Class
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        // go to edit configuration, so you can see the list of environtment available to be called by getenv
        System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
        System.out.println(System.getenv("APPDATA"));

        System.gc();

        // exit JVM
        System.exit(0);

        // this statement won't printed out
        System.out.println("Hello");

    }
}
