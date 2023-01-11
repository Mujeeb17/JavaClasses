package class5.class5homework;

import java.util.Scanner;

/*
Write a program to find largest number among three numbers using
nested if provided by a user (numbers must be distinct)
 */
public class LargestThreeNumbersNestedIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 double values");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        if (n1 > n2){
            if(n1 > n3) {
                System.out.println("the largest number is " + n1);
            }
        }else if (n2 > n3){
            if(n2 > n1) {
                System.out.println("the largest number is " + n2);
            }
        } else if (n3 > n2){
            if(n3 > n1) {
                System.out.println("the largest number is " + n3);
            }
        }

    }
}
