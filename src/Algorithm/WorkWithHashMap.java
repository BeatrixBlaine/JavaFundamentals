package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class WorkWithHashMap {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
        map.put("Electronics", new HashMap<>());
        map.put("Furniture", new HashMap<>());
        map.get("Electronics").put("Laptop", 1500);
        map.get("Electronics").put("Android", 700);
        map.get("Furniture").put("Table", 1300);
        map.get("Furniture").put("Wardrobe", 500);
        map.get("Furniture").put("Chair", 200);
        map.put("Sports", new HashMap<>());

        printMostExpensiveProducts(map);
        System.out.println("---------------------");
        printNestedInventory(map);


    }

    public static void printMostExpensiveProducts(HashMap<String, HashMap<String, Integer>> inventory) {
        // Write your code here
        if (inventory.isEmpty()) {
            System.out.println("No categories in inventory.");
        } else {

            for (Map.Entry<String, HashMap<String, Integer>> outerEntry : inventory.entrySet()) {
                System.out.println("Category: " + outerEntry.getKey());

                if (outerEntry.getValue().isEmpty()) {
                    System.out.println("  No products available.");
                    continue;
                }

                int highest = Integer.MIN_VALUE; // don't use 0
                String product = null;

                for (Map.Entry<String, Integer> innerEntry : outerEntry.getValue().entrySet()) {
                    if (highest < innerEntry.getValue()) {
                        highest = innerEntry.getValue();
                        product = innerEntry.getKey();
                    }
                }

                System.out.println("  Most Expensive Product: " + product + ", Price: " + highest);
            }

        }
    }

    public static void printNestedInventory(HashMap<String, HashMap<String, Integer>> inventory) {
        // Iterate over each category in the outer HashMap
        // For each category, print "Category: <name>"
        // If the inner map is empty, print "  (No products)"
        // Otherwise, iterate over each product and print "  Product: <name>, Price: <price>"
        // Write your code here
        for(Map.Entry<String, HashMap<String, Integer>> entry : inventory.entrySet()) {
            System.out.println("Category: " + entry.getKey());
            if (entry.getValue().isEmpty()) {
                System.out.println("  (No products)");
                continue;
            }
            for (Map.Entry<String, Integer> innerEntry : entry.getValue().entrySet()) {
                System.out.println("  Product: " + innerEntry.getKey() + ", Price: " + innerEntry.getValue());
            }
        }
    }


}
