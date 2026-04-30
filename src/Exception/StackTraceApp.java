package Exception;

import RecordClass.LoginRequest;

public class StackTraceApp {

    public static void main(String[] args) {

        // trying multi error with stack trace
        try {
            SampleError2();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    public static void SampleError() {
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

    public static void SampleError2() {
        try {
            String[] name = {
                    "Icad", "Sarah", "Ade"
            };
            System.out.println(name[5]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

}
