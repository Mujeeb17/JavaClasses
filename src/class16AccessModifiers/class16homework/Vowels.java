package class16AccessModifiers.class16homework;
/*
Create a method that will accept a String as a parameter and return a new String
that consist only of vowels. Method should be available inside
the class only where it was declared and executed by calling it is name.
 */
public class Vowels {

    private static String vowels(String str) {

        //this replaces all characters in string EXCEPT for the vowels because we used '^'
        String newStr = str.replaceAll("[^aeiouAEIOU]", "");
        return newStr;
    }

    public static void main(String[] args) {

        System.out.println(vowels("mommy"));

    }
}
