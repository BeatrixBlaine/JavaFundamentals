package Ecommerce;

public class ProductApp {

    public static void main(String[] args) {

        Product product = new Product("Indomie", 2000);

        System.out.println(product.name);
        System.out.println(product.price);
        // toString method
        System.out.println(product);
        System.out.println();

        /*
         Location is an abstract class, City extends Location, so that City can access and
         modify the variable declared in Location
         */
        var obj = new City();
        obj.name = "Bandung";
        System.out.println(obj.name);


    }
}
