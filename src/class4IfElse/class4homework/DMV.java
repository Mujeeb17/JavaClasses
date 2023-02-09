package class4IfElse.class4homework;
import java.util.Scanner;
/*
TASK 4: You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver licence to them,
otherwise you will offer them to get a learners permit.
 */
public class DMV {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your age");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("we will issue you a driver's license");
        } else {
            System.out.println("you should get a learner's permit");
        }
    }
}
