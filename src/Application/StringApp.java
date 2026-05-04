package Application;

public class StringApp {

    public static void main(String[] args) {
        String name = "Irsyad";
        name = name + " " + "Ibrahim";

        System.out.println(name);
        // the "Irsyad" and " Ibrahim" will take 2 space of memory, because String is immutable

        // use String builder, this will store variable username in 1 memory
        StringBuilder username = new StringBuilder("Icad");
        System.out.println(username);
        // append another string
        username.append(" ");
        username.append("suka Indomie");
        System.out.println(username);
    }

}
