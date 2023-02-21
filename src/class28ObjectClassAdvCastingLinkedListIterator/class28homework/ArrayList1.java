package class28ObjectClassAdvCastingLinkedListIterator.class28homework;

import java.util.ArrayList;

/*
1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Bob");
        names.add("Joe");
        names.add("Jack");
        names.add("John");
        names.add("Johnny");

        //checking if ArrayList is empty
        System.out.println(names.isEmpty());

        //checking if Jack is inside the ArrayList
        System.out.println(names.contains("Jack"));

        //displaying size of ArrayList
        System.out.println(names.size());

        //printing all values inside the ArrayList
        System.out.println(names);
    }
}
