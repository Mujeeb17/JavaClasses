package class9Arrays;

public class Arrays5 {
    public static void main(String[] args) {

        //create an empty array then store 45 44 33 20 and 10 in it
        // then use a loop to add all the elements which are present on even indexes and print it

        int[] numbers = new int[5]; //the '5' is including the index '0' so your numbers[] max is [4]

        numbers[0] = 45;
        numbers[1] = 44;
        numbers[2] = 33;
        numbers[3] = 20;
        numbers[4] = 10;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);

        System.out.println("*********");

        //create an array and store 10 20 30 4 5 6 7 80
        //add all the elements which are multiples of 2

        int nums[] = {10, 20, 30, 4, 5, 6, 7, 80};
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sum2 += nums[i];
            }
        }
        System.out.println(sum2);
    }
}
