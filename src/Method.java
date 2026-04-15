public class Method {
    public static void main(String[] args) {

    sayHelloWorld();
    sayHelloWorld();

    var x = 20;
    var y = 10;
    add(y);

    var t = square(y);
    System.out.println(t);

    var j = sum(x,y);
    System.out.println(j);

    var p = substract(x,y);
    System.out.println(p);

    var k = mul(x, y);
    System.out.println(k);


    // array data
    int[] nilai = {100, 95, 70, 65, 80};
    String nama = "Icad";

    // call the method with the current parameter that we had
    sayCongrats("Icad", nilai);


    }

    /* this is the method that we called in the static void main
    (it can only calls 'static' method)
     */
    static void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    // adding parameter with itself method
    static void add(int x) {
        System.out.println(x + x);
    }

    // square method
    static int square(int x) {
        var total = x * x;
        return total;
    }

    // sum method
    static int sum(int x, int y) {
        var total = x + y;
        return total;
    }

    // substract method
    static int substract(int x, int y) {
        var total = x - y;
        return total;
    }

    // multiplication method
    static int mul(int x, int y) {
        var total = x * y;
        return total;
    }

    // String and array as parameter
    static void sayCongrats(String nama, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }

        int result = total / values.length;

        if (result >= 75) {
            System.out.println("Selamat " + nama + ", anda lulus!");
            System.out.println("Dengan rata-rata nilai " + result);
        } else {
            System.out.println("Maaf " + nama + ", anda tidak lulus!");
            System.out.println("Dengan rata-rata nilai " + result);
        }
    }


}
