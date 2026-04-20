public class PolymorphismNiece extends Polymorphism {

    PolymorphismNiece(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", Goodnight from " + this.name + "!");
    }
}
