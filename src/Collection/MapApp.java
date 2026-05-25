package Collection;

import Algorithm.PrintArray;

import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {

        Map<String, String> dict = new HashMap<>();
        dict.put("Name", "Irsyad");
        dict.put("Umur", "25");

        PrintArray.printArray(dict);
        System.out.println();
        System.out.println(dict.size());
        System.out.println(dict.get("Name"));
        System.out.println(dict.keySet()); // get all the Key
        System.out.println(dict.values()); // get all the values

    }
}
