package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachApp {

    public static void main(String[] args) {

        List<String> list = List.of("Icad", "Dina", "Sarah");

        // for each loop
        for (var value : list) {
            System.out.println(value);
        }

        // for each anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // lambda
        list.forEach(value -> System.out.println(value));

        // lambda method reference
        list.forEach(System.out::println);

        // List
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Icad", "Dina", "Eki", "asfhasfhahsfa", "sadasdasdas"));

        // remove if without lambda
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

        // remove if with lambda
        names.removeIf(name -> name.length() > 5); // name is parameter, can be rename with anything
        System.out.println(names);

    }

}
