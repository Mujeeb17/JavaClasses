package class2;

public class Operators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        //adding uses +
        //subtract uses -
        //multiplying uses *
        //dividing uses /
        //modulus or finding remainder uses %

        //notice how num1 / num2 is printing 0, but the right answer is 0.5.
        //this is because it should be a double, not an int, if we want to see decimals

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);


    }
}
