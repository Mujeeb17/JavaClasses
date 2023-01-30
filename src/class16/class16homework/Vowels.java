package class16.class16homework;
/*
Create a method that will accept a String as a parameter and return a new String
that consist only of vowels. Method should be available inside
the class only where it was declared and executed by calling it is name.
 */
public class Vowels {

    private static String vowels(String s){
        String v ="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'|| s.charAt(i) == 'o' || s.charAt(i) == 'y'){
                v+=s.charAt(i);
            }
        }
        return v;
    }

    public static void main(String[] args) {

        System.out.println(vowels("mommy"));
    }
}
