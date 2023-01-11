package class5.class5homework;
import java.util.Scanner;
/*
7) Ask user to enter their country and capture it. Once values are captured print which language user speaks.
 */
public class Countries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your country");
        String c = input.next();

        switch (c.toLowerCase()){
            case "canada":
                System.out.println("english");
                break;
            case "russia":
                System.out.println("russian");
                break;
            case "italy":
                System.out.println("italian");
                break;
            case "france":
                System.out.println("french");
                break;
            case "germany":
                System.out.println("german");
                break;
        }
    }
}
