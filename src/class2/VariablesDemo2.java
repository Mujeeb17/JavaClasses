package class2;

public class VariablesDemo2 {
    public static void main(String[] args) {

        int num1 = 10;
        num1 = 25; // we reassigned num1 to 25, so it will overwrite 10 with 20

        System.out.println(num1);

        num1 = 250; // reassigned again
        System.out.println(num1);

        num1 = 9890890; // reassigned again
        System.out.println(num1);

        int num2 = 20;

        System.out.println("\n" + num2*2);
        System.out.println(num2*3);
        System.out.println(num2*4);
        System.out.println(num2*5);
    }
}
