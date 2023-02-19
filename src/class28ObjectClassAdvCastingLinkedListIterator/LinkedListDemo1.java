package class28ObjectClassAdvCastingLinkedListIterator;

import java.util.LinkedList;
public class LinkedListDemo1 {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Bob");
        names.add("Joe");
        names.add("Jack");
        names.add("Daniel");
        System.out.println(names);

        for (String x: names){
            System.out.print(x.toUpperCase() + " ");
        }
    }
}
