package Generic;

public class BoundedTypeClass <T extends Number> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
