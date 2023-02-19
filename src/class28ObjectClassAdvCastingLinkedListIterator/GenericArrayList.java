package class28ObjectClassAdvCastingLinkedListIterator;

import java.util.ArrayList;

public class GenericArrayList {
    public static void main(String[] args) {

        //this is a non-generic list
        ArrayList a = new ArrayList();

        //we can add any type of data in the array.
        //non-generic list is very old and problematic we shouldn't use it like this
        a.add(1);
        a.add('d');
        a.add("String");

        // we should only use the diamond OP like the following
        // (we should specify the data type)

        //this is considered generic in java language
        ArrayList<String> names = new ArrayList<>();

        names.add("Joe");
        names.add("Jack");
        names.add("Bob");
        names.add("Daniel");

        //Since Object is the parent class of all classes automatically, we can
        //use it as the data type for this for loop (We learned in polymorphism,
        //the parent class can hold the objects of its child class)
        for(Object x: names){

            //because its type Object, we can't use the methods
            //that are in the String class unless we cast it
            System.out.println(((String) x).toUpperCase());
            }
        }
    }
