package class5.class5homework;
import java.util.Scanner;
/*
3) Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */
public class Scores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your score for: 1. quiz, 2. mid term, 3. final");
        double q = input.nextDouble();
        double m = input.nextDouble();
        double f = input.nextDouble();

        double avg = (q + m + f) / 3;

        if (avg >= 90) {
            System.out.println("grade = A");
        } else if (avg >= 70 && avg <= 90) {
            System.out.println("grade = B");
        } else if (avg >= 50 && avg < 70) {
            System.out.println("grade = C");
        } else if (avg < 50) {
            System.out.println("grade = F");
        }
    }
}
