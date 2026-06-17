package Collection;

import Algorithm.PrintArray;
import TestClass.UserClass;
import TestClass.UsersHobby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        // Use List interface for reference is preferred than ArrayList
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(7);
        arrayList.set(1, 3); // arrayList.set(index, value to be stored)

        PrintArray.printArray(arrayList);

        arrayList.remove(1);
        System.out.println();
        PrintArray.printArray(arrayList);
        System.out.println();
        System.out.println(arrayList.get(1));
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Before removing index 1, elements after it are shifted left.
        // For example, value 7 moves from index 2 to index 1.
        // ArrayList must shift all following elements, which makes removal in the middle slower than LinkedList.

        String[] names = {"Sajan", "Yuli", "Cita"};

        List<String> strings = new LinkedList<>();
        strings.add("Icad");
        strings.addAll(Arrays.asList(names)); // add an array that already contains multiple data to LinkedList
        PrintArray.printArray(strings);
        System.out.println();
        System.out.println(strings.contains("Icad"));
        System.out.println("---------------");

        // storing Object of Class UserClass in an Arraylist
        UserClass user1 = new UserClass("Icad", 25, "Bandung");
        UserClass user2 = new UserClass("Sajan", 23, "Bandung");
        UserClass user3 = new UserClass("Cita", 22, "Jakarta");

        List<UserClass> people = new ArrayList<>();
        people.add(user1);
        people.add(user2);
        people.add(user3);

        System.out.println(people);
        System.out.println("---------------");

        // store user in Array and do addAll
        UserClass user4 = new UserClass("Yuli", 25, "Poland");
        UserClass user5 = new UserClass("Dina", 27, "Australia");
        UserClass user6 = new UserClass("Sarah", 26, "Dubai");

        // important notes, use Userclass[] as the array reference not Object[]
        UserClass[] users = {user4, user5, user6};
        people.addAll(Arrays.asList(users));
        System.out.println(people);
        System.out.println("---------------");

        // or you can use List.of, for example lets create another arraylist object called facebookUser
        List<UserClass> facebookUser = new ArrayList<>(List.of(user1,user2,user3,user4,user5));
        System.out.println(facebookUser);
        System.out.println("---------------");

        // example from UsersHobby class, with hobbies as Arraylist
        // this is an example of arraylist inside of arraylist
        UsersHobby value1 = new UsersHobby("Icad");
        value1.addHobby("Reading");
        value1.addHobby("Gaming");

        UsersHobby value2 = new UsersHobby("Sarah");
        value2.addHobby("Baking");
        value2.addHobby("Writing");
        value2.printData();
        System.out.println("---------------");

        List<UsersHobby> usersHobbies = new ArrayList<>(List.of(value1,value2));
        System.out.println(usersHobbies);

    }
}
