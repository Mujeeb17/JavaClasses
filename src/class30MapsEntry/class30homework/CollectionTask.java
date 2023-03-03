package class30MapsEntry.class30homework;

import java.util.LinkedHashSet;
import java.util.Set;

/*
4)Create the collection that will store single uniques
Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.
 */
public class CollectionTask {
    public static void main(String[] args) {

        Set<String> c = new LinkedHashSet<>();

        c.add("Java");
        c.add("is");
        c.add("very");
        c.add("powerful");

        String all = "";

        for (String x: c){
            all += x;
        }
        System.out.println(all);
    }
}
