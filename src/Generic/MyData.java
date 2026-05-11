package Generic;

public class MyData<T> {

    private T data;

    public MyData(T data) {
        this.data = data;
    }

    // Empty Constructor
    public MyData() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
