package Algorithm;

public class EqualsApp {

    public static void main(String[] args) {

        String first = "Irsyad";
        first = first + " " + "Ibrahim";
        System.out.println(first);

        String second = "Irsyad Ibrahim";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

    }

}
