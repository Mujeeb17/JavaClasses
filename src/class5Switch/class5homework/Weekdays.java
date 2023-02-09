package class5Switch.class5homework;
import java.util.Scanner;
/*
2) Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”,
anyday from 6-7 → output “It is a weekend”,
any other day → output “Invalid day”
 */
public class Weekdays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter day number");
        int day = input.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("it is a weekday");
                break;
            case 6:
            case 7:
                System.out.println("it is a weekend");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }



    }
}
