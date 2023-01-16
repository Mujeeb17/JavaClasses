package class8.class8homework;
import java.util.Scanner;
/*
2) Create a program that will be asking user to apply for a credit card 10 times.
As soon you get an “yes” from a user program should stop asking.
 */
public class CreditCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want to apply for a credit card? (yes/no)");
            String c = input.next();

            if (c.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for applying");
                break;
            }
        }
    }
}
