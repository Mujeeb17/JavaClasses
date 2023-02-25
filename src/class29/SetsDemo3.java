package class29;
import java.util.TreeSet;

public class SetsDemo3 {
    public static void main(String[] args) {

        //removes duplicates and sorts the data
        TreeSet<String> fruit = new TreeSet<>();

        fruit.add("mango");
        fruit.add("kiwi");
        fruit.add("orange");
        fruit.add("mango");

        //sorts Strings alphabetically
        System.out.println(fruit);

        TreeSet<Integer> num = new TreeSet<>();

        num.add(50);
        num.add(40);
        num.add(80);
        num.add(10);

        //sorts numbers from least to greatest
        System.out.println(num);
    }
}
