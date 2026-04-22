package Interface;

public class CarApp {

    public static void main(String[] args) {

        // Can't use Car interface as an object, make it from Lamborghini class
        Car car = new Lamborghini();
        System.out.println(car.getTire());
        car.drive();

    }
}
