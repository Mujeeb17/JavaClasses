package class29SetsMaps;

import java.util.HashSet;

public class SetsDemo1 {
    public static void main(String[] args) {

        //doesn't maintain insertion order and doesn't allow duplicates
        HashSet<String> fruit = new HashSet<>();

        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("mango");

        System.out.println(fruit);
    }
}
