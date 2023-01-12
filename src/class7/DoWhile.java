package class7;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0;

        //do while loops are used when we want the code to run at least once
        //because the condition is checked after
        do {
            System.out.println("please enter a number");
            num = input.nextInt();
        } while (num != 5); //it will keep asking us to enter a number until we enter 5
        System.out.println("WHY YOU CHOSE 5 (x_x)");


    }
}
