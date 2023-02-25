package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<Double> num = new ArrayList<>();

        num.add(10.0);
        num.add(20.2);
        num.add(30.5);
        num.add(40.6);
        num.add(50.7);

        Iterator<Double> x = num.iterator();

        num.removeIf(aDouble -> aDouble > 11);

        System.out.println(num);


    }
}
