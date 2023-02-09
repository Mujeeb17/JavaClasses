package class4IfElse.class4homework;
/*
TASK 1: Write a program to store a boolean value of whether user has diploma or not. If user has a diploma,
you should say congratulations, otherwise program should suggest to get a degree. Then if user has a
degree program should check a gpa score. If gpa score is higher or equals to 3.5 → output should say
“You are eligible for scholarship”, otherwise → “You should have studied harder”
 */
public class Diploma {
    public static void main(String[] args) {

        boolean diploma = true;
        boolean degProgram = true;
        double gpa = 3.5;

        if (diploma) {
            System.out.println("congratulations");
            if (degProgram) {
                if (gpa >= 3.5) {
                    System.out.println("you are eligible for scholarship");
                } else {
                    System.out.println("you should've studied harder");
                }
            }
        } else {
            System.out.println("get a degree");
        }
    }
}
