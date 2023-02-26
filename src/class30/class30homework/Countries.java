package class30.class30homework;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */
public class Countries {
    public static void main(String[] args) {

        Map<String, String> cc = new TreeMap<>();

        cc.put("Egypt", "Cairo");
        cc.put("England", "London");
        cc.put("Canada", "Ottawa");
        cc.put("USA", "Washington");

        //this set contains objects of the Entry class
        Set<Map.Entry<String, String>> entrySet = cc.entrySet();
        // easier way to do above is:
        // var entrySet = cc.entrySet();

        for (var entry: entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("**********");

        //using iterator
        var iterator = entrySet.iterator();

        while (iterator.hasNext()){
            var entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("***********");

        //2nd part of the task
        var values = cc.values();
        for (var value: values){
            System.out.println(value);
        }

        System.out.println("*************");
        var i = cc.values().iterator();
        while (i.hasNext()){
            var e = i.next();
            System.out.println(e);
        }
    }
}
