package class30MapsEntry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemovingElemWithEntryset {

    //repl task
    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<>();

        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        Set<Map.Entry<String, String>> e = map.entrySet();

        System.out.println("HashMap Before Remove :");
        for(Map.Entry<String, String> x: e){
            String k = x.getKey();
            String v = x.getValue();

            System.out.println(k + " : " + v);
        }

        //removing the elements using the key value
        e.removeIf(x -> ("ONE".equals(x.getKey())));
        e.removeIf(x -> ("FOUR".equals(x.getKey())));


        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        for(Map.Entry<String, String> x: e){
            String k = x.getKey();
            String v = x.getValue();

            System.out.println(k + " : " + v);
        }
    }
}
