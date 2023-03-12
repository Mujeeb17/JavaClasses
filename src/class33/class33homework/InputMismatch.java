package class33.class33homework;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1) How would handle InputMismatchException? Input Mismatch Exception when
user enters mismatch value then programmer expected.
 */
public class InputMismatch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{

            System.out.println("Please a number");
            int num = input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("You did not enter a number.");
            input.close();
        }

    }
}
