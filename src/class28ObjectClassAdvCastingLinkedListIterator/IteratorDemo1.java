package class28ObjectClassAdvCastingLinkedListIterator;

import java.util.ArrayList;

public class IteratorDemo1 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
/*
        for (String x: words){
            if(x.endsWith("a")){
                words.remove(x);
            }
        }
        //this gives error because indexes will shift and rearrange itself when we remove an element
        //so the information that the loop was given has now changed so the
        //for loop is confused now (ArrayList is dynamic during runtime)
*/

        //this doesn't work properly but it doesn't give you an error
        //the output will change based on the sequence of elements inside 'words'
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
