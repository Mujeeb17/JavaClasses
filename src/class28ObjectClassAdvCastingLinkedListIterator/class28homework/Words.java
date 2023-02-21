package class28ObjectClassAdvCastingLinkedListIterator.class28homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
3)Create an arrayList of words. Remove every word that ends with “e”.
 */
public class Words {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Selenium");
        words.add("Dive");
        words.add("Selena");
        words.add("Drive");

        for (Iterator<String> i = words.iterator(); i.hasNext();){
            String s = (String) i.next();
            if (s.endsWith("e")){
                i.remove();
            }
        }

      // words.removeIf(word -> word.endsWith("e"));

        System.out.println(words);
    }
}
