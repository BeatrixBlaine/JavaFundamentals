public class PolymorphismChild extends Polymorphism {

    PolymorphismChild(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", Happy Birthday! From " + this.name);
    }

}
