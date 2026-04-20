public class Parent {
    String name;

    void doIt() {
        System.out.println("This is parent!");
    }

}

class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("This is child!");
    }
}
