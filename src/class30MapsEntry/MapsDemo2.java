package class30MapsEntry;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {

        Map<String, Double> fruit = new HashMap<>();

        fruit.put("Apple", 1.99);
        fruit.put("Orange", 2.99);
        fruit.put("Banana", 4.99);
        fruit.put("Kiwi", 0.99);
        fruit.put("Kiwi", 1.99);
        fruit.put(null, 90.1);
        //when there are duplicate keys (which are not allowed),
        //the key will have the most latest value or most recently updated
        System.out.println(fruit);
        System.out.println(fruit.get(null));


        Map<String, Double> makeup = new HashMap<>();

        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eyeliner", 12.2);
        makeup.put("Blush-on", 12.2);
        System.out.println(makeup);

        Map<String, Double> groceries = new HashMap<>();

        groceries.putAll(makeup);
        groceries.putAll(fruit);
        System.out.println(groceries);
    }
}
