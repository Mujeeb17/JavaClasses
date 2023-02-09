package class13StringClassStringbuilder.class13homework;
/*
1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.
 */
public class RemoveSpaces {
    public static void main(String[] args) {

        String s = "I am learning Java.";

        System.out.println(s.replaceAll(" ", ""));
    }
}
