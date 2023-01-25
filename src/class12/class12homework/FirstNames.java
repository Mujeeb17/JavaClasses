package class12.class12homework;

import java.util.Scanner;

public class FirstNames {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the mom's first name");
        String mom = input.next();

        System.out.println("Please enter the dad's first name");
        String dad = input.next();

        System.out.println("Boy or Girl?");
        String baby = input.next();

        if (baby.equalsIgnoreCase("boy")) {
            //takes 1st half of dad's name                   takes 2nd half of mom's name
            System.out.print(dad.substring(0, dad.length() / 2).toUpperCase() + mom.substring(mom.length() / 2, mom.length()).toUpperCase());
        } else if (baby.equalsIgnoreCase("girl")) {
            System.out.println(mom.substring(0, mom.length() / 2).toUpperCase() + dad.substring(dad.length() / 2, dad.length()).toUpperCase());
        }
    }
}
