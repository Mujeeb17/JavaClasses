package class9;

public class Arrays4 {
    public static void main(String[] args) {

        //another way of creating an array but its empty

        int [] numbers = new int[5]; // empty array that can store 6 variables is created

        //all of the values are initialized to 0
        System.out.println(numbers[1]);

        System.out.println("*****");

        //now storing values in the variables
        numbers[0]=50;
        numbers[1]=30;
        numbers[2]=55;
        numbers[3]=60;
        numbers[4]=52;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
