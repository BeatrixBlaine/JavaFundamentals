package Collection;

import java.util.*;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,5,8,10,11);

        Spliterator<Integer> sp1 = numbers.spliterator();
        Spliterator<Integer> sp2 = sp1.trySplit();

        System.out.println(sp1.estimateSize());
        System.out.println(sp2.estimateSize());

        sp1.forEachRemaining(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(8);
        nums.add(0);

        int[] newArr = new int[nums.size()]; // make sure the size is correct

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = nums.get(i); // input from nums value to array that created;
        }

        for (var j : newArr) {
            System.out.println(j);
        }

        // convert String List to Object Array
        List<String> names = List.of("Icad", "Dina", "Sarah");
        Object[] objects = names.toArray();

        System.out.println(Arrays.toString(objects));

    }
}
