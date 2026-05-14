package Application;

import Generic.PersonGeneric;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableApp {
    public static void main(String[] args) {

        PersonGeneric[] people = {
                new PersonGeneric("Icad", "Indonesia"),
                new PersonGeneric("Sarah", "Indonesia"),
                new PersonGeneric("Sisil", "Indonesia")
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

        // Comparator
        Comparator<PersonGeneric> comparator = new Comparator<PersonGeneric>() {
            @Override
            public int compare(PersonGeneric o1, PersonGeneric o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));

    }
}
