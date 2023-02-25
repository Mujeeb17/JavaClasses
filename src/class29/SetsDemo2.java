package class29;

import java.util.LinkedHashSet;

public class SetsDemo2 {
    public static void main(String[] args) {

        //doesn't allow duplicates but maintains insertion order
        LinkedHashSet<String> fruit = new LinkedHashSet<>();

        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("mango");

        System.out.println(fruit);
    }
}
