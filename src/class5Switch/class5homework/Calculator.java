package class5Switch.class5homework;
import java.util.Scanner;
/*
8)HomeWork: Using scanner class create calculator.
Allow user to enter 2 numbers and operator(+,-,*,/).
Based on operator provide the result to user.
 */
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number");
        double n1 = input.nextDouble();
        System.out.println("Please enter the second number");
        double n2 = input.nextDouble();
        System.out.println("Please enter the operator (+ , - , * , /)");
        char o = input.next().charAt(0);

        switch (o){
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
                break;
            case '-':
                System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
                break;
            case '*':
                System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
                break;
            case '/':
                System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
                break;
        }
    }
}
