package Interface;

public class Lamborghini implements Car, isForSale{

    @Override
    public void drive() {
        System.out.println("Lamborghini Car");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public String getType() {
        return "Gallardo";
    }

    @Override
    public boolean isForSale() {
        return true;
    }
}
