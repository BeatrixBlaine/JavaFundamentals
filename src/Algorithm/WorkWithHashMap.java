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

        HashMap<String, Integer> warehouse = new HashMap<>();
        warehouse.put("Laptop", 10);
        warehouse.put("Mouse", 100);
        warehouse.put("Shoes", 40);
        warehouse.put("Phone", 37);

        String[] operations = {
                "ADD Laptop 30",
                "REMOVE Mouse 27",
                "ADD Guitar 17",
                "CHECK Phone",
                "CHECK Umbrella",
                "PRINT"
        };

        System.out.println("---------------------");
        manageWarehouse(warehouse, operations);


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

    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operations) {
        // Write your code here

        for (int i = 0; i < operations.length; i++) {
            String[] op = operations[i].split(" ");

            String command = op[0];

            switch (command) {
                case "ADD":
                    String key = op[1];
                    int addValue = Integer.parseInt(op[2]);
                    if (warehouse.containsKey(key)) {
                        int currentValue = warehouse.get(key);
                        warehouse.put(key, currentValue + addValue);
                    } else {
                        warehouse.put(key, addValue);
                    }
                    break;

                case "REMOVE":
                    String key1 = op[1];
                    int removeValue = Integer.parseInt(op[2]);

                    if (warehouse.containsKey(key1)) {
                        int currentValue = warehouse.get(key1);

                        if (currentValue <= removeValue) {
                            warehouse.remove(key1);
                        } else {
                            warehouse.put(key1, currentValue - removeValue);
                        }
                    }
                    break;

                case "CHECK":
                    String key2 = op[1];
                    System.out.println(warehouse.containsKey(key2));
                    break;

                case "PRINT":
                    for (Map.Entry<String, Integer> entry : warehouse.entrySet()) {
                        System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
                    }
                    break;

            }

        }

    }
}
