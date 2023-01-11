package class4.class4homework;
import java.util.Scanner;
/*
TASK 6: Create a Java program that will ask if user has a credit card or not.
If you user does not have a credit card then offer them. If they do have one
ask what is balance on the card? If balance of the card is larger than 1000,
tell them to pay off immediately, otherwise you can tell them that they can spend more.
 */
public class CreditCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a credit card? (enter either 'true' or 'false')");
        boolean credit = input.nextBoolean();

        if (credit) {
            System.out.println("what is the balance on the card?");
            double bal = input.nextDouble();

            if (bal > 1000) {
                System.out.println("pay it off immediately");
            } else {
                System.out.println("you can spend more money");
            }
        } else {
            System.out.println("we can get you one");
        }

    }
}
