package class5;

import java.util.Scanner;

public class SwitchCase3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your gender (M/F)");
        char gender = input.next().charAt(0);

        switch (gender) {
            case 'f': //in case the user inputted a capital letter, this works because there's no 'break' after
            case 'F':
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("Not specified");
        }

        input.close();
    }
}
