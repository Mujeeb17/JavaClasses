package class9Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        int [] numbers = {10, 20, 30, 45, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n******");

        //write code to add all numbers form the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
