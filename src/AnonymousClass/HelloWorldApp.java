package AnonymousClass;

public class HelloWorldApp {

    public static void main(String[] args) {

        // Anonymous Class, creating instance from HelloWorld interface
        // normally interface should be implemented to other classes, then use it in the main app
        HelloWorld obj = new HelloWorld()/* <-- this is the anonymous class */ {
            @Override
            public void sayHello() {
                System.out.println("Hello World!");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        obj.sayHello();
        obj.sayHello("Icad");

        // static method
        sayGoodbye();

    }

    // static method, can only be called in static app without creating object
    public static void sayGoodbye() {
        System.out.println("Goodbye");
    }
}
