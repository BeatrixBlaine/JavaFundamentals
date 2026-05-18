package Application;

public class TestApp {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int value = j * i;

                if ((value >= 10 || value <= 10) && j == 5) {
                    System.out.print(value);
                } else if (value >= 10 && j != 5) {
                    System.out.print(value + " ");
                } else {
                    System.out.print(value + "  ");
                }
            }
            System.out.println();
        }

    }
}
