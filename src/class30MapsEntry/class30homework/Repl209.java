package class30MapsEntry.class30homework;

import java.util.*;

public class Repl209 {
    //type 'main' to autocomplete line below
    public static void main(String[] args) {

        List<Map<String, Object>> dataList = new ArrayList<>();

        Map<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.0);
        appleMap.put("Quantity", 10);

        dataList.add(appleMap);

        Map<String, Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10);

        dataList.add(orangeMap);

        double total = 0;

        for (Map<String, Object> x : dataList) {
            Set<String> keySet = x.keySet();

            double sum = 0;
            double p = 0;
            double q = 0;

            for (String k : keySet) {
                System.out.print(k + ": " + x.get(k) + " ");
                if (k.equals("Price")) {
                    p = (Double) x.get(k);
                } else if (k.equals("Quantity")) {
                    q = (Integer) x.get(k);
                }

            }
            sum = p * q;
            total += sum;
            System.out.print("Subtotal: " + sum);
            System.out.println();
        }
        System.out.println("Your Purchase Total : " + total);
    }
/*
Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0

Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998

Your Purchase total : 419.9
 */
}//end of class

