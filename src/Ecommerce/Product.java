package Ecommerce;

import java.util.Objects;

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

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;

        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }
}
