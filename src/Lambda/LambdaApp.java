package Lambda;

import Algorithm.PrintArray;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaApp {
    public static void main(String[] args) {

        SimpleAction action = new SimpleAction() {
            @Override
            public String action() {
                return "Icad";
            }
        };

        System.out.println(action.action());

        SimpleAction action1 = () -> "Icad"; // Simplify anonymous class above with lambda expression

        System.out.println(action1.action());

        AdvanceAction act = new AdvanceAction() {
            @Override
            public String action(String name) {
                return "Hello " + name;
            }
        };

        System.out.println(act.action("Sarah"));

        AdvanceAction act1 = (name) -> "Hello " + name; // methods in AdvanceAction needs a parameter, rewrite the require
        // parameter in this bracket

        System.out.println(act1.action("Dina"));

        Addition add = (a, b) -> {
            int result = a + b;
            return result;
        };

        // Addition add = (a, b) -> a + b;

        System.out.println(add.add(2,2));

        Array2D array1 = () -> new int[][]{
                {2, 2, 2},
                {1, 2, 3},
                {1, 4 ,5}
        };

        Array2D array2 = () -> new int[][]{
                {4, 6, 7},
                {2, 1, 6},
                {4, 6, 7}
        };

        PrintArray.printArray(array1.action());
        System.out.println("----------------------");
        
        Matrix2DAddition acts = (matrix1, matrix2) -> {
            if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
                return new int[][]{
                        {-1, -1},
                        {-1, -1}
                };
            }

            int[][] result = new int[matrix1.length][matrix1[0].length];

            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            return result;
        };

        PrintArray.printArray(acts.add(array1.action(),array2.action()));
        System.out.println("----------------------");

        // java.util.function
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };

        consumer.accept("Example");

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(function.apply("Irsyad"));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                int length = s.length();
                if (length > 5) {
                    return true;
                }
                return false;
            }
        };

        System.out.println(predicate.test("Irsyad"));

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Halo";
            }
        };

        System.out.println(supplier.get());

        // Method Reference
        Predicate<String> predicateIsLowerCase = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return StringUtil.isLowerCase(s);
            }
        };

        System.out.println(predicateIsLowerCase.test("Icad"));

        Predicate<String> predicate1 = value -> StringUtil.isLowerCase(value);

        System.out.println(predicate1.test("icad"));

    }
}
