package class5Switch.class5homework;
import java.util.Scanner;
/*
1) Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
 */
public class Height {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height in inches");
        int h = input.nextInt();

        if (h < 60){
            System.out.println("short");
        } else if (h >= 60 && h <= 72){
            System.out.println("medium");
        } else if(h > 72) {
            System.out.println("tall");
        }

    }
}
