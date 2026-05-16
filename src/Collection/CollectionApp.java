package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("Icad");
        collection.add("Sarah");
        collection.add("Cita");
        collection.addAll(List.of("Kiya", "Ade", "Maslin"));

        for (var i : collection) {
            System.out.println(i);
        }

        collection.remove("Ade"); // return boolean
        System.out.println("--------------");
        for (var i : collection) {
            System.out.println(i);
        }

        System.out.println("--------------");
        System.out.println(collection.contains("Icad")); // return boolean

        System.out.println("--------------"); // to Array
        String[] names = new String[0];
        names = collection.toArray(names);
        System.out.println(Arrays.toString(names));

        System.out.println("--------------");
        System.out.println(collection.size());

    }
}
