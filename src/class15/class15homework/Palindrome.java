package class15.class15homework;
/*
3) Create a method that will print whether given String is palindrome or not.
 */
//we are not asked to return anything form the method so the proper way to
//do this is a void method although boolean method is easier

public class Palindrome {

    static boolean isPalindrome(String input){
        StringBuilder p = new StringBuilder(input);
        return p.reverse().toString().equals(input);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aka"));
    }
}