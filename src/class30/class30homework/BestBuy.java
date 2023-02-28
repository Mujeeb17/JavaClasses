package class30.class30homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
1) Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class BestBuy {
    public static void main(String[] args) {

        Map<Integer, String> bb = new HashMap<>();

        bb.put(7645789, "Printer");
        bb.put(7234578, "TV");
        bb.put(7785908, "Console");
        bb.put(7546327, "Video game");

        Set<Map.Entry<Integer, String>> entrySet = bb.entrySet();

        for(Map.Entry<Integer, String> x: entrySet){
            System.out.println(x.getKey());
            System.out.println(x.getValue());
            System.out.println();
        }
    }
}
