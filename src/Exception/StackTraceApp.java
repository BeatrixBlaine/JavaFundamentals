package Exception;

public class StackTraceApp {

    public static void main(String[] args) {

        try {
            String[] name = {
                    "Icad", "Sarah", "Ade"
            };
            System.out.println(name[5]);
        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();
        }

    }

}
