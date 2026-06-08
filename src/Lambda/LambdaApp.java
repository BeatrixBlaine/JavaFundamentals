package Lambda;

public class LambdaApp {
    public static void main(String[] args) {

        SimpleAction action = new SimpleAction() {
            @Override
            public String action() {
                return "Icad";
            }
        };

        System.out.println(action.action());

        SimpleAction action1 = () -> "Icad"; // Simplify anonymous class above with lambda expression

        System.out.println(action1.action());

    }
}
