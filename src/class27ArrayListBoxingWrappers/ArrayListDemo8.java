package class27ArrayListBoxingWrappers;

import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Joe");
        names.add("Bob");
        names.add("Daniel");
        names.add("Danny");

        //clear() will delete everything
        names.clear();
        System.out.println(names);
    }
}
