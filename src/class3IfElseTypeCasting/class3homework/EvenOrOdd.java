package class3IfElseTypeCasting.class3homework;

/*
Task 5: check if a number is even or odd
 */
public class EvenOrOdd {
    public static void main(String[] args) {

        int x = -5;
        int val = x % 2;

        if (!(val == 0)) {
            System.out.println("the number is odd");
        } else {
            System.out.println("the number is even");
        }
    }
}
