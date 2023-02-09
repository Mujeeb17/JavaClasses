package class10ForEach2DArray;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        /*
        System.out.println("Please input 5 integer values");
        nums[0] = input.nextInt();
        nums[1] = input.nextInt();
        nums[2] = input.nextInt();
        nums[3] = input.nextInt();
        nums[4] = input.nextInt();
        */

        System.out.println("Please enter 5 integer values");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(nums));

    }
}
