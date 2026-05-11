package Application;

import Algorithm.PrintArray;
import Generic.GenericUtils;
import Generic.MyData;
import Generic.PairData;

import java.util.Arrays;

public class GenericApp {
    public static void main(String[] args) {

        // create object
        MyData<String> data = new MyData<String>();
        MyData<Integer> num = new MyData<Integer>();
        MyData<Double> myDouble = new MyData<Double>();

        // Different data type depends on what you fill in the generic
        // <String> <Integer> <Double>
        data.setData("Icad");
        num.setData(100);
        myDouble.setData(150.00);

        System.out.println(data.getData());
        System.out.println(num.getData());
        System.out.println(myDouble.getData());

        // Multiple parameter generic, I created String & Integer
        PairData<String, Integer> pair = new PairData<String, Integer>();
        pair.setValue1("Irsyad");
        pair.setValue2(25);

        PairData<String, Double> pair2 = new PairData<String, Double>("Temperature", 27.00);

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

    }
}
