package class8BreakContinue.class8homework;

import java.util.Scanner;

/*
4) Write a program to ask a user to enter item they want to buy and the
price of that item. Every time user enters money accumulate the amount
and tell the user how much is left to pay off. If user give more money
program should return a change. Whenever a user done with payments program
should say "Thank you for shopping!"
 */
public class Shopping {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean i = true;
        double sum = 0;
        while (i) {
            System.out.println("Your balance is $" + sum);
            System.out.println("Do you want to add an item (please input y)");
            System.out.println("Do you want to pay your balance (please input p)");
            System.out.println("Do you want to leave payment program (please input l)");
            String in = input.next();

            if (in.equalsIgnoreCase("y")) {

                System.out.println("Please enter the item you want to buy");
                String itemName = input.nextLine();

                System.out.println("Please enter the price of " + itemName);
                double p = input.nextDouble();

                sum += p;

            } else if (in.equalsIgnoreCase("l")) {
                i = false;
            } else if (in.equalsIgnoreCase("p")) {
                System.out.println("How much are you paying?");
                sum = sum - input.nextDouble();
            }
        }
        System.out.println("Thank you for shopping!");
    }
}
