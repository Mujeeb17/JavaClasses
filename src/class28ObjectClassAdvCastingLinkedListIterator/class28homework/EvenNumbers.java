package class28ObjectClassAdvCastingLinkedListIterator.class28homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
 */
public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        //adding even numbers from 1 to 500 to ArrayList
        for (int j = 0; j < 501; j += 2) {
            num.add(j);
        }

        System.out.println(num);

        //creating an iterator to loop through elements inside ArrayList
        for(Iterator<Integer> i = num.iterator(); i.hasNext();){
            if (i.next() % 5 == 0){
                i.remove();
            }
        }

        System.out.println(num);
    }
}
