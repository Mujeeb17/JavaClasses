package class5.class5homework;
import java.util.Scanner;
/*
Task 5: Write a program to find largest of three double values using if-
else if and logical operators provided by a user (numbers must be distinct)
 */
public class LargestThreeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 double values");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        if (n1 > n2 && n1 > n3) {
            System.out.println("The greatest number is n1: " + n1);
        }else if (n2 > n1 && n2 > n3) {
            System.out.println("The greatest number is n2: " + n2);
        }else if (n3 > n2 && n3 > n1) {
            System.out.println("The greatest number is n3: " + n3);
        }
    }
}
