package class4;

public class IfElseConditions2 {
    public static void main(String[] args) {

        int day = 2;

        //if we make each statement with 'if' instead of 'else if'
        //the program will run slower
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("wednesday");
        } else if (day == 4) {
            System.out.println("thursday");
        } else if (day == 5) {
            System.out.println("friday");
        } else if (day == 6) {
            System.out.println("saturday");
        } else if (day == 7) {
            System.out.println("sunday");
        } else {
            System.out.println("there's only 7 days in a week dum bitch");
        }
    }
}
