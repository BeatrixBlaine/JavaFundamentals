public class InheritanceApp {

    public static void main(String[] args) {

        // parent class Inheritance
        var inheritance = new Inheritance();
        inheritance.nama = "Irsyad";
        inheritance.sayHello("Sarah");

        // calling method in Example class which is a child from Inheritance
        var example = new Example();
        example.nama = "Icad";
        example.sayHello("Zahrah");

        int value1 = 10;
        int value2 = 5;

        var result = example.sum(value1, value2);
        System.out.println(result);

        var result2 = inheritance.sum(value1, value2);
        System.out.println(result2);
    }
}
