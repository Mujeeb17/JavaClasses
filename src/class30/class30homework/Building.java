package class30.class30homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Create a map of a building. Store floor number and it is associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class Building {
    public static void main(String[] args) {

        Map<Integer, String> building = new HashMap<>();

        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Apple");
        building.put(3, "Spotify");
        building.put(4, "Lenovo");
        building.put(5, "Dell");
        building.put(6, "Hp");
        building.put(7, "Samsung");

        //checking amount of entries
        System.out.println(building.size());

        //updating company on 4th floor
        building.replace(4, "LG");

        //removing company on 7th floor
        building.remove(7);

        System.out.println(building);
    }
}
