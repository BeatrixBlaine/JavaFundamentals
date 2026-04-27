package Algorithm;

// import Ecommerce package
import Ecommerce.*;

public class EqualsApp {

    public static void main(String[] args) {

        String first = "Irsyad";
        first = first + " " + "Ibrahim";
        System.out.println(first);

        String second = "Irsyad Ibrahim";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        Product product = new Product("Sabun", 10000);
        Product product1 = new Product("Sabun", 10000);

        System.out.println(product);
        System.out.println(product1);
        System.out.println(product1.equals(product));
        System.out.println(product1.hashCode() == product.hashCode());

    }
}
