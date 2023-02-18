package class27ArrayListBoxingWrappers;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {

        ArrayList<Boolean> boo = new ArrayList<>();

        boo.add(true);
        boo.add(false);
        boo.add(false);
        boo.add(true);

        //the 'get' method in ArrayList allows to get the value
        //of a specific index in the ArrayList
        System.out.println(boo.get(3));

        //size() method is that same as length() for normal arrays
        System.out.println(boo.size());

        System.out.println();

        //normal for loop that prints all elements of the ArrayList
        for (int i = 0; i < boo.size(); i++) {
            System.out.println(boo.get(i));
        }
        //length() == size() in ArrayList
        //boo[] == get() in ArrayList

        System.out.println();

        //use while loop to do the same thing
        int i = 0;
        while (i < boo.size()){
            System.out.println(boo.get(i));
            i++;
        }
    }
}
