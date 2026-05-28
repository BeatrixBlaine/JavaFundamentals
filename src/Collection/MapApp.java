package Collection;

import Algorithm.PrintArray;
import com.sun.nio.sctp.SendFailedNotification;

import java.util.*;

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

        // Identity HashMap
        Map<String, String> identity = new IdentityHashMap<>();
        String key1 = "first.Name";
        String first = "first";
        String dot = ".";
        String name = "Name";
        String key2 = first + dot + name;

        identity.put(key1, "Irsyad");
        identity.put(key2, "Irsyad");

        System.out.println(identity.size()); // I don't have any idea what is identityHashMap

        // LinkedHashMap
        Map<String, Integer> linked = new LinkedHashMap<>();
        linked.put("first", 10);
        linked.put("second", 10);
        linked.put("third", 10);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("first", 10);
        hashMap.put("second", 10);
        hashMap.put("third", 10);

        Set<String> keys = linked.keySet();
        for (var key : keys) {
            System.out.println(key);
        }
        System.out.println();
        Set<String> hash = hashMap.keySet(); // see the order difference between LinkedHashMap and HashMap
        for (var key : hash) {
            System.out.println(key);
        }

        // EnumMap
        Map<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
        enumMap.put(Level.FREE, "Irsyad");
        enumMap.put(Level.VIP, "Cita");
        enumMap.put(Level.VIP, "Dinda");

        System.out.println(enumMap.keySet());

        // SortedMap
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(7, "Icad");
        sortedMap.put(3, "Cita");
        sortedMap.put(1, "Dina");

        System.out.println(sortedMap.keySet()); // sorted by its keys, from lowest number to higher number

        // Entry Map
        Map<String, Integer> entry = new HashMap<>();
        entry.put("Icad", 25);
        entry.put("Sarah", 26);
        entry.put("Dinda", 21);

        Set<Map.Entry<String, Integer>> entries = entry.entrySet();
        for (var i : entries) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

        for (Map.Entry<String, Integer> i : entry.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

    }

    public static enum Level {
        FREE, PREMIUM, VIP
    }
}
