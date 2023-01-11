package class5.class5homework;
import java.util.Scanner;
/*
Allow user to enter grade and then provide explanation:
A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
At the end your program should print which grade was entered by a user with explanation.
 */
public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your grade: A, B, C, D");
        char g = input.next().charAt(0);

        switch (g){
            case 'A':
                System.out.println("grade = A, Excellent");
                break;
            case 'B':
                System.out.println("grade = B, Good");
                break;
            case 'C':
                System.out.println("grade = C, Average");
                break;
            case 'D':
                System.out.println("grade = D, Bad");
                break;
        }
    }
}
