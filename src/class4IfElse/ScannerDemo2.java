package class4IfElse;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");

        //if you want to take an integer input from user
        //type "nextInt" instead of "nextLine" for String
        int age = input.nextInt();
        //This rule applies for other data types ex:
        //for double:  "nextDouble"
        //for boolean: "nextBoolean" etc.

        System.out.println("you are " + age + " years old");
    }
}
