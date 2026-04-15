public class Person {

    // declare variable to be modified by PersonApp
    String name;
    String address;
    final String country = "Indonesia";

    // create a method to be called by PersonApp
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }

}
