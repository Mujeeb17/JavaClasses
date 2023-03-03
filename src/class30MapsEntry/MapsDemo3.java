package class30MapsEntry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo3 {
    public static void main(String[] args) {

        Map<String, Double> makeup = new HashMap<>();

        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eyeliner", 12.2);
        makeup.put("Blush-on", 12.2);
        System.out.println(makeup);

        //to get all keys we can use keySet() method from map interface
        Set<String> allKeys = makeup.keySet();
        System.out.println(allKeys);

        //delete all entries where the key is more than 7 characters
        allKeys.removeIf(x -> x.length() > 7);
        System.out.println(makeup);
        //even though we're removing the entries from the set, java is magical
        //and it does the same for the map because they're linked behind the scenes
    }
}
