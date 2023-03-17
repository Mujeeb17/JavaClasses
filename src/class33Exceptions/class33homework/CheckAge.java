package class33Exceptions.class33homework;

import java.util.Scanner;

/*
3) Create a method to check age eligibility that will
throw a runtime exception. Method should throw an exception age is less than 16.
 */
public class CheckAge {

    static boolean checkAge(int age){
        if(age < 16){
            throw new RuntimeException("Age is less than 16");
        } else {
            return true;
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age");
        int a = input.nextInt();

        checkAge(a);
        System.out.println("You're good to go!");
    }
}
