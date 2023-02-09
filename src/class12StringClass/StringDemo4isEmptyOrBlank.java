package class12StringClass;

public class StringDemo4isEmptyOrBlank {
    public static void main(String[] args) {

        String str = "";

        //the isEmpty() method returns a boolean output
        System.out.println(str.isEmpty()); //will return true because 'str' is empty

        String str2 = "  ";

        //the isBlank() method returns a boolean output but it will ignore spaces in the String,
        //isEmpty() does not ignore spaces, if a String has spaces it will be considered "not empty" (false)

        /*
        isEmpty checks if a string has a length of 0, meaning it contains no characters.
        It returns true for an empty string "" and false for a string containing only whitespace " ".
         */

        System.out.println(str2.isBlank());
        System.out.println(str2.isEmpty());
    }
}
