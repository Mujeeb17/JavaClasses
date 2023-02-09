package class5Switch.class5homework;
import java.util.Scanner;
/*
4)Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”.
 */
public class BirthMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth month");
        String month = input.next();

        switch(month.toLowerCase()){
            case "december":
            case "january":
            case "february":
                System.out.println("You were born in winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("you were born in spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("you were born in summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("you were born in fall");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
