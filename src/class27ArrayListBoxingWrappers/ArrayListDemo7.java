package class27ArrayListBoxingWrappers;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo7 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Joe");
        names.add("Bob");
        names.add("Daniel");
        names.add("Danny");

        System.out.println(names.contains("Bob"));

        System.out.println(names);
        //in simple arrays, we can't remove elements
        //in ArrayList, we can remove elements like this:
        names.remove(1);
        //you can put either index or actual name as parameters
        System.out.println(names);

        //to replace values in ArrayList, use set() method
        names.set(2, "Julie");
        System.out.println(names);

        //if the list is big and you want to find the index of an element,
        //use indexOf() method.
    }
}
