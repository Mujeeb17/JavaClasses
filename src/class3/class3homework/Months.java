package class3.class3homework;
/*
TASK 3: declare int variable that will hold a month.
Based on the value, program should print the
name of the month
 */
public class Months {
    public static void main(String[] args) {

        int month = 5;

        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        } else if (month == 12) {
            System.out.println("December");
        } else {
            System.out.println("choose number from 1 - 12");
        }
    }
}
