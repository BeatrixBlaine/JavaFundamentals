package Interface;

public class Chevrolet implements Car, isForSale {

    @Override
    public void drive() {
        System.out.println("ngeng");
    }

    @Override
    public int getTire() {
        return 4;
    }

    @Override
    public String getType() {
        return "Sport Car";
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
