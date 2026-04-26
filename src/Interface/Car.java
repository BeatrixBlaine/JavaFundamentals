package Interface;

public interface Car extends Vechile{

    void drive();
    int getTire();

    // default method, so that other classes doesn't require to implement this method
    default boolean isBig() {
        return false;
    };

}
