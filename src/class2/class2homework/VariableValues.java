package class2.class2homework;

/*
TASK 2: Create a Java program and name it VariableValues In your program create
variables to store all different types of primitive data. Update(reassign) value
of each variable, print the value of each variable
 */
public class VariableValues {
    public static void main(String[] args) {

        //declaring and assigning each variable
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807l;
        float num5 = 10.1234567f;
        double num6 = 100.123456789123456789;
        char symbol = '#';
        boolean val1 = true;

        //reassigning the value of each variable
        num1 = 120;
        num2 = 32000;
        num3 = 2000000;
        num4 = 999999999l;
        num5 = 10.7f;
        num6 = 100.55;
        symbol = '$';
        val1 = false;

        //printing updated variables
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(symbol);
        System.out.println(val1);

    }//end of main method

}//end of class
