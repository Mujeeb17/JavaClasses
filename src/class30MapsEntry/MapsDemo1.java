package class30MapsEntry;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Ned");
        students.put(2, "Fred");
        students.put(4, "Lead");
        students.put(5, "Freddy");
        students.put(3, "Sed");

        System.out.println(students);

        System.out.println(students.get(3));

        System.out.println(students.size());

        System.out.println(students.containsKey(100));

        System.out.println(students.containsValue("Ned"));

        System.out.println(students.remove(2));
        System.out.println(students);

        students.replace(4, "Letty");
        System.out.println(students);


    }
}
