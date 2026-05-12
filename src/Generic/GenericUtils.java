package Generic;

import java.util.Arrays;

public class GenericUtils {

    // generic method
    public static <T> int count(T[] value) {
        return value.length;
    }

    public static <T> String printAll(T[] array){
        return Arrays.toString(array);
    }

    // covariant
    public static void process(MyData<? extends Object> data) {
        Object object = data.getData();
        System.out.println(object);
    }

    // multiparameter covariant
    public static void process(PairData<?, ?> data) {
        Object[] objects = data.getAll();
        System.out.println(printAll(objects));
    }

    // contravariant
    public static void setString(MyData<? super String> data) {
        data.setData("Sarah");
    }

    public static void setString(PairData<? super String, ? super String> data) {
        data.setValue1("Irsyad");
        data.setValue2("Sarah");
    }

}
