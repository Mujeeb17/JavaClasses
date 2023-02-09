package class14Methods;

import java.util.Scanner;

public class Methods2Tester {
    public static void main(String[] args) {

        //creating an object of the class so we could call the method
        Methods2 hi = new Methods2();

        //calling a method
        hi.printHello();

        Scanner input = new Scanner(System.in);
        System.out.println("How times should i say hello");
        int i = input.nextInt();

        //in the () we are passing the 'times' to the method printHelloManyTimes
        hi.printHelloManyTimes(i);

        System.out.println("how many times");
        int t = input.nextInt();

        System.out.println("What do you want to print");
        String w = input.next();

        hi.printManyTimes(t, w);
    }
}
