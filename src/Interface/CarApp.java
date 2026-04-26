package Interface;

import java.lang.reflect.Array;

public class CarApp {

    public static void main(String[] args) {

        // Can't use Car interface as an object, make it from Lamborghini class
        Car car = new Lamborghini();
        System.out.println(car.getTire());
        car.drive();
        System.out.println(car.getType());

        // from isForSale interface
        isForSale obj = new Lamborghini();
        System.out.println(obj.isForSale());

        // from Chevrolet class
        Chevrolet obj2 = new Chevrolet();
        System.out.println("This is default method from Car interface, and only Chevrolet Class has it: " + obj2.isBig());

    }

}
