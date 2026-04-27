package EnumClass;

public class EnumApp {
    public static void main(String[] args) {

        System.out.println(Level.PREMIUM);

        Customer customer = new Customer();
        customer.setName("Icad");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());
        System.out.println("-------------------");

        // enum conversion to String, and String to enum
        String description = Level.PREMIUM.getDescription();
        System.out.println(description);
        System.out.println("-------------------");

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);
        System.out.println("-------------------");

        // into array, print out all value inside Enum
        Level[] values = Level.values();
        for (var c : values) {
            System.out.println(c.getDescription());
        }
        System.out.println("-------------------");
        for (var x : values) {
            System.out.println(x);
        }

    }
}
