package class27ArrayListBoxingWrappers;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        //this is how we create ArrayList
        ArrayList<String> names = new ArrayList<String>();
        // the <> is not necessary but good practice (called diamond operator)
        // we put the data type inside diamond operator

        //this is how we add values to the ArrayList
        names.add("Joey");
        names.add("Bob");
        names.add("Daniel");
        names.add("Danny");

        //we dont need a loop to print all the elements like an array
        //we can just do
        System.out.println(names);
    }
}
