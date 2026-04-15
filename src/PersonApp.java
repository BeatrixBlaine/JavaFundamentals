public class PersonApp {

    public static void main(String[] args) {

        // create an object called person1 and person2
        Person person1 = new Person();
        var person2 = new Person();

        // initialize variables from attributes in Person class
        person1.name = "Irsyad";
        person1.address = "Bandung";

        person2.name = "Sarah";
        person2.address = "Bandung";

        // try
        System.out.println("Hello, my name is " + person2.name);
        System.out.println("I live in " + person2.address);
        System.out.println();
        person1.sayHello("Sarah");
    }
}
