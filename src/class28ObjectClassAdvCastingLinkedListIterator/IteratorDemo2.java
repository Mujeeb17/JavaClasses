package class28ObjectClassAdvCastingLinkedListIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        words.add("Shredder");
        words.add("Booer");

        //the correct way to remove elements is by using iterators
        //because they're compatible with dynamic lists

        Iterator<String> i = words.iterator();

        while(i.hasNext()){
            String s = i.next();
            if (s.endsWith("a")){
                i.remove();
            }
        }

        System.out.println(words);

        //there is an even better way to do the above code using
        //lambda expressions
        words.removeIf(s -> s.endsWith("r"));
        //the 's' is java being very intelligent and knowing that 's' is a String
        //all we need to write is the variable name

        System.out.println(words);

        //the keyword 'var' is just variable, whatever you stored, java will know what
        //you are trying to store, but it has limitations (only available after java 10
        //so some companies might not have it because they're stuck at java 8)

        var j= 1567;
        var a= "String";
    }
}
