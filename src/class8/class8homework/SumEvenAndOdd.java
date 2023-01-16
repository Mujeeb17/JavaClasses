package class8.class8homework;
import java.util.Scanner;
/*
3) Write a program that reads a range of integers (start and end point),
provided by a user and then from that range prints the sum of the even and odd integers.
 */
public class SumEvenAndOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the start number");
        int n1 = input.nextInt();
        System.out.println("Please enter the end number");
        int n2 = input.nextInt();

        int oddSum = 0, evenSum = 0;

        //i has to equal the start of the range of numbers because we
        //will be using it as the number that will be added to even/odd sum
        //i must be in the range of numbers (condition)
        for (int i = n1; i >= n1 && i <= n2; i++) {

            //as long as i is an even number, we will be adding it to the even sum
            if (i % 2 == 0) {
                evenSum+=i;

            //every other number will be odd, so we will add that number to the odd sum
            } else {
                oddSum+=i;
            }

        }
        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}
