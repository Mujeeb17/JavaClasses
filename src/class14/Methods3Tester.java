package class14;

import java.util.Scanner;

public class Methods3Tester {
    public static void main(String[] args) {

        Methods3 md = new Methods3();
        Scanner input = new Scanner(System.in);

        System.out.println("enter 2 numbers");
        int one = input.nextInt();
        int two = input.nextInt();
        md.add(one, two);

        System.out.println("enter 2 more numbers");
        int n11 = input.nextInt();
        int n22 = input.nextInt();
        System.out.println(md.sub(n11, n22));
        //Or you could:
        //int result = md.sub(n11, n22);
        //System.out.println(result);
    }
}
