package class30MapsEntry;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo4 {
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

        //remove all keys from the map if they're greater than 2
        Set<Integer> allKeys = students.keySet();
//        allKeys.removeIf(s -> s > 2);
//        System.out.println(students);

        //remove all values that contains letter 'e'
        Collection<String> allValues = students.values();
//        allValues.removeIf(x -> x.contains("e"));
//        System.out.println(students)


    }
}
