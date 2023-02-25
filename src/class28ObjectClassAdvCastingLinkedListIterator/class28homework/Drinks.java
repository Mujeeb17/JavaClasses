package class28ObjectClassAdvCastingLinkedListIterator.class28homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
 */
public class Drinks {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("pepsi");
        drinks.add("coke");
        drinks.add("fanta");
        drinks.add("monster");
        drinks.add("milk");

        //2 ways that completes this task:

        //1 way:

        for (String s : drinks) {
            if (s.contains("a") || s.contains("e")) {
                drinks.set(drinks.indexOf(s), "water");
            }
        }

        System.out.println(drinks);
/*
        //2nd way:

        //for loop is allowed in this situation because we aren't changing the
        //size of the ArrayList
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).endsWith("e") || drinks.get(i).endsWith("a")){
                drinks.set(i, "water");
            }
        }

        System.out.println(drinks);
*/
    }
}
