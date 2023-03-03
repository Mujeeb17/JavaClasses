package class29SetsMaps.class29homework;

import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that insertion order
is maintained. Then remove any city that starts with “A”;
 */
public class City {
    public static void main(String[] args) {

        LinkedHashSet<String> city = new LinkedHashSet<>();

        city.add("Toronto");
        city.add("NewYork");
        city.add("Armenia");
        city.add("Cairo");
        city.add("London");

        city.removeIf(s -> s.startsWith("A"));

        System.out.println(city);
    }
}
