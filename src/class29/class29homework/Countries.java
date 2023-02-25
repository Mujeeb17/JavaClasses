package class29.class29homework;

import java.util.TreeSet;

/*
Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order.
Using 2 different ways retrieve all elements from set.
 */
public class Countries {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();

        countries.add("Canada");
        countries.add("USA");
        countries.add("Australia");
        countries.add("Egypt");

        //1st way
        System.out.println(countries);

        //2nd way
        for(String x: countries){
            System.out.print(x + " ");
        }
    }
}
