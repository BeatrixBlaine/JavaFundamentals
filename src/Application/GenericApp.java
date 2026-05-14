package Application;

import Algorithm.PrintArray;
import Generic.BoundedTypeClass;
import Generic.GenericUtils;
import Generic.MyData;
import Generic.PairData;

import java.util.Arrays;

public class GenericApp {
    public static void main(String[] args) {

        // create object
        MyData<String> data = new MyData<>();
        MyData<Integer> num = new MyData<>();
        MyData<Double> myDouble = new MyData<>();

        // Different data type depends on what you fill in the generic
        // <String> <Integer> <Double>
        data.setData("Icad");
        num.setData(100);
        myDouble.setData(150.00);

        System.out.println(data.getData());
        System.out.println(num.getData());
        System.out.println(myDouble.getData());

        // Multiple parameter generic, I created String & Integer
        PairData<String, Integer> pair = new PairData<>();
        pair.setValue1("Irsyad");
        pair.setValue2(25);

        PairData<String, Double> pair2 = new PairData<>("Temperature", 27.00);

        System.out.println("---------------");
        System.out.println(pair.getValue1());
        System.out.println(pair2.getValue2());

        // method getAll to return all the value stored, print it with Arrays.toString
        System.out.println("---------------");
        System.out.println(Arrays.toString(pair.getAll()));
        PrintArray.printArray(pair.getAll());

        // generic method from Generic Utils Class
        System.out.println("---------------");
        System.out.println(GenericUtils.count(pair.getAll()));
        System.out.println(GenericUtils.printAll(pair.getAll()));
        System.out.println(GenericUtils.printAll(pair2.getAll()));

        // covariant method process (read only)
        System.out.println("---------------");
        GenericUtils.process(data);
        GenericUtils.process(pair2);
        GenericUtils.process(pair);

        // contravariant method (write)
        PairData <Object, Object> data1 = new PairData<>();
        MyData <Object> data2 = new MyData<>();
        System.out.println("---------------");
        GenericUtils.setString(data1); // method setString write a value into the Object created
        GenericUtils.setString(data2);
        GenericUtils.process(data1); // method process to printout
        GenericUtils.process(data2);

        // Bounded Type Parameter (Generic class with limited data type)
        // BoundedTypeClass extends number, so it only works if the generic is number
        // example Double, Float, Integer etc.
        System.out.println("---------------");
        BoundedTypeClass<Double> boundedTypeClass = new BoundedTypeClass<>();
        boundedTypeClass.setData(10.0);
        System.out.println(boundedTypeClass.getData());

    }
}
