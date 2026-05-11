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

}
