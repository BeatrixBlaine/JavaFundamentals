package ThreadApp;

public class ThreadApp {
    public static void main(String[] args) {
        Runnable task = new MyRunnable();

        Thread thread = new Thread(task);

        thread.start();

        System.out.println("Main thread continues");
    }
}
