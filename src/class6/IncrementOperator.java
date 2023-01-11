package class6;

public class IncrementOperator {
    public static void main(String[] args) {

        int num = 10;

        //3 different ways we can add 1 to a number
        num = num + 1;
        System.out.println(num);

        num = ++num;
        System.out.println(num);

        num += 1;
        System.out.println(num);

        //now practicing subtraction
        int  num2 = 10;

        --num2;
        System.out.println(num2);

        num2 -= 1;
        System.out.println(num2);
    }
}
