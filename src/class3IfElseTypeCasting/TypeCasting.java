package class3IfElseTypeCasting;
//type casting converts a variable to another data type
public class TypeCasting {
    public static void main(String[] args) {

        long num1 = 125;
        //byte shortNum = num1; //this statement doesn't work because you are trying to convert a 'long' to a 'byte'

        //proper way to do this is
        byte shortNum = (byte) num1;

        System.out.println(shortNum);

        //practice
        float f =10.7f;
        int num2 = (int) f;
        System.out.println(num2); //note that if you convert decimal to an int, the number will always round down

        byte b =10;
        int num3 = b; //note that java is not complaining because byte is a smaller size than int
        // Larger box to smaller box = complain
        //smaller box to larger box = no complain


    }
}
