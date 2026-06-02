package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethod {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Icad", "Icad");
        map.put("Sarah", "Sarah");
        map.put("Dina", "Dina");

        // for each loop
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ": " + value);
            }
        });

    }
}
