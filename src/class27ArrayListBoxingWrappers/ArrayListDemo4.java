package class27ArrayListBoxingWrappers;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        //This is how we make an ArrayList for integers
        ArrayList<Integer> nums = new ArrayList<Integer>();
        //we must put a class name inside diamond operators
        //so we put the wrapper class: Integer
        //this is because ArrayList doesn't support primitive data types

        nums.add(2);
        nums.add(7);
        nums.add(1);
        nums.add(6);

        System.out.println(nums);


    }
}
