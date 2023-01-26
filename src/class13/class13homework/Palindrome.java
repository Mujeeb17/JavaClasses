package class13.class13homework;
/*
5) How would you check if String is palindrome or not? aba=> true
Abbc =>false
 */
public class Palindrome {
    public static void main(String[] args) {

        String s = "Kayak";
        String a = "";

        for (int i = s.length() - 1; i >= 0 ; i--) {
            a += s.charAt(i);
        }
        if(a.equalsIgnoreCase(s)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
