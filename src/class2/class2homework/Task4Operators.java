package class2.class2homework;

/*
TASK 4: Write a java program to add, subtract, multiply, and divide 2 decimal values.
Write a program to find the square of the number 3.9
 */
public class Task4Operators {
    public static void main(String[] args) {

        //declaring & assigning decimal values
        float num1 = 3.5f;
        float num2 = 3.5f;
        double num3 = 3.9;

        //printing required statements & completing operations
        System.out.println("the addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 + num2));
        System.out.println("the subtraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 - num2));
        System.out.println("the multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 * num2));
        System.out.println("the division of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 / num2));

        System.out.println("\nthe square of the " + num3 + " is " + (num3 * num3));
    }//end of main method
}//end of class
