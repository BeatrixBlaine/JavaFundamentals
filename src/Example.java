public class Example extends Inheritance {
    @Override
    int sum(int value1, int value2) {
        return super.sum(value1, value2);
    }

    @Override
    void sayHello(String nama) {
        System.out.println("Hello " + nama + ", I'm " + this.nama);
    }
}
