package Generic;

public class PairData<T, U> {

    private T value1;
    private U value2;

    public PairData(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public PairData() {
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public Object[] getAll() {
        // Use Object, so that it can return any type of value (Here I store String & Integer as an example)
        return new Object[]{value1, value2};
    }
}
