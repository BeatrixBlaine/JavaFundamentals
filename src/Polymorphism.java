public class Polymorphism {
    String name;

    Polymorphism(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }

}
