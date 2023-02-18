package class27ArrayListBoxingWrappers;
import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('A');
        chars.add('S');
        chars.add('U');
        chars.add('S');
        chars.add('H');

        System.out.println(chars);
        //if you don't want to print it with the [] make a loop:

        //in for each loop we use the wrapper class
        for(Character x: chars){
            System.out.print(x + " ");
        }

    }
}
