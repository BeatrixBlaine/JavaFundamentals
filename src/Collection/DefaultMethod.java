package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DefaultMethod {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        // replace all current value inside Arraylist
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2; // you can change this to integer * 10 or anything, the integer argument is pointed to current value
                            // inside the arraylist
            }
        });

        System.out.println(numbers);

        // for each loop
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println(numbers.size());
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 100; // remove if integer > 100, the arraylist size is automatically shorter
            }
        });

        System.out.println(numbers);
        System.out.println(numbers.size());

    }
}
