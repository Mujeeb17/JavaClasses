package class8BreakContinue;
import java.util.Scanner;
public class LoopWithString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your name");
        while (input.next().equalsIgnoreCase("Sha")){
            System.out.println("Best student ever");
            System.out.println("please enter another name");
        }

        System.out.println("worst student, failure, loser");
    }
}
