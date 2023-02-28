package class30.class30homework;

import java.util.ArrayList;
import java.util.List;

/*
5)Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Sum {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(7);
        num.add(8);
        num.add(4);
        num.add(9);
        num.add(2);

        int sum = 0;

        for (Integer x : num) {
            sum += x;
        }

        System.out.println("Sum of all integers: " + sum);
    }
}
