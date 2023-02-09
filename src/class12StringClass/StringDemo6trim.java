package class12StringClass;

public class StringDemo6trim {
    public static void main(String[] args) {

        String str = "    Java    ";

        //if you want to remove the spaces that are in the string,
        //use the trim() method
        System.out.println(str);
        System.out.println(str.trim());

        //trim() method only removes spaces from the start and ending,
        //not the spaces in between
    }
}
