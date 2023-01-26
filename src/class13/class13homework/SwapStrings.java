package class13.class13homework;
/*
6) How would you swap  2 strings without a temporary variable?
 */
public class SwapStrings {
    public static void main(String[] args) {
        String s = "Java";
        String a = "Python";

        System.out.println("old s = " + s + "\nold a = " + a);

        // append 2nd string to 1st
        a = a + s;

        // store initial string a in string s
        s = a.substring(0,a.length()-s.length());

        // store initial string s in string a
        a = a.substring(s.length());

        // print String after swapping
        System.out.println("Strings after swap: \na = " + a + "\ns = " + s);
    }
}
