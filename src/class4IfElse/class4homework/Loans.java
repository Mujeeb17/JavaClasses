package class4IfElse.class4homework;
import java.util.Scanner;
/*
TASK 3: You are a loan specialist and you need to ask user what is the amount
of loan is needed. If loan is less or equal to 200,000 then you would lend
the money otherwise you would reject the client.
 */
public class Loans {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the amount of loan needed");
        double loan = input.nextDouble();

        if (loan <= 200000) {
            System.out.println("we will lend you the money");
        } else {
            System.out.println("get a loan elsewhere");
        }

    }
}
