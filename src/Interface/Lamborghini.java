package Interface;

public class Lamborghini implements Car{

    @Override
    public void drive() {
        System.out.println("Lamborghini Car");
    }

    @Override
    public int getTire() {
        return 4;
    }
}
