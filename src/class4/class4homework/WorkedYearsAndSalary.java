package class4.class4homework;
import java.util.Scanner;
/*
TASK 7: Write a program to ask user to enter numbers of worked years
and annual salary. If user worked for more or equals to 5 years than
user is eligible for the bonus, otherwise he is not. Once user is eligible
and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
 */
public class WorkedYearsAndSalary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number of years you've worked");
        int wy = input.nextInt();

        System.out.println("please enter your annual salary");
        double as = input.nextDouble();

         if (wy >= 5) {
             System.out.println("you are eligible for the bonus");
             if (as > 50000) {
                 System.out.println("your bonus is $5000");
             } else {
                 System.out.println("your bonus is $3000");
             }
         } else {
             System.out.println("you are not eligible for the bonus");
         }

    }
}
