public class MethodOverloading {

    public void saySomething(String nama){
        System.out.println("Hello " + nama);
    }

    public void saySomething(String nama, int age){
        System.out.println("Hello " + nama + ", you are " + age + " years old");
    }

    public void saySomething(int number){
        if (number % 2 == 0) {
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }
    }

    public static void main(String[] args) {

        // create an object because it's not static method
        MethodOverloading obj = new MethodOverloading();

        // try method with different parameter

        
        obj.saySomething("Icad");
        obj.saySomething("Sarah", 26);
        obj.saySomething(9);
    }
}
