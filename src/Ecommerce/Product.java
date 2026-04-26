package Ecommerce;

public class Product {

    // Access modifier to protected, so it cannot be accessed through other packages
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // override toString
    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }
}
