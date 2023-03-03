package class30MapsEntry;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Ned");
        students.put(2, "Fred");
        students.put(3, "Sed");
        students.put(4, "Lead");
        students.put(5, "Freddy");
        students.put(6, "Betty");
        students.put(7, "Jo");
        System.out.println(students);

        //remove entries if key is greater than 2 and value contains 'e'

        //to do this we have to use a data structure like
        //map or create a class object with 2 fields

        //just like keySet() and values(), this entrySet() is giving us a Set
        //that contains entries of type Integer and String
        Set<Entry<Integer, String>> entrySet = students.entrySet();

        for (Entry<Integer, String> entry: entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

        //now to do the task
        entrySet.removeIf(x -> x.getKey() > 2 && x.getValue().contains("e"));
        System.out.println(students);
    }
}
