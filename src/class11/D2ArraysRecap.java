package class11;

import java.util.Arrays;

public class D2ArraysRecap {
    public static void main(String[] args) {

        int[][] nums = {{10, 20, 30}, {45, 55, 66}, {30, 40, 20, 10, 25}};

        System.out.println(nums[2][4]);

        System.out.println("***********");

        System.out.println(Arrays.toString(nums[0]));
        for (int i = 0; i < nums[0].length; i++) {
            System.out.print(nums[0][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums[1].length; i++) {
            System.out.print(nums[1][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums[2].length; i++) {
            System.out.print(nums[2][i] + " ");
        }
    }
}
