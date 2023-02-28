package class30.class30homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
3)Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class Employee {
    public static void main(String[] args) {

        Map<String, Integer> employee = new HashMap<>();

        employee.put("Johnny Green", 80000);
        employee.put("Bob Brown", 1000000);
        employee.put("Joey Grey", 90000);

        Set<Map.Entry<String, Integer>> entrySet = employee.entrySet();

        int max = 0;
        String n = "";

        for (Map.Entry<String, Integer> x : entrySet) {
            if (x.getValue() > max) {
                max = x.getValue();
                n = x.getKey();
            }
        }
        System.out.println(n + "=$" + max);
    }
}
