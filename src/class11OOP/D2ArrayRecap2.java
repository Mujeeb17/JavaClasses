package class11OOP;

public class D2ArrayRecap2 {
    public static void main(String[] args) {

        int[][] nums = {{10, 20, 30}, {45, 55, 66}, {30, 40, 20, 10, 25}};

        //write a loop to print all the elements from the 2D array

        //nums.length = the amount of individual arrays
        for (int i = 0; i < nums.length; i++) {

            //nums[i].length = the amount of numbers inside the individual array
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("*********");

        //now only print the odd numbers from the 2D array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] % 2 != 0) {
                    System.out.print(nums[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("**********");

        //use enhanced for loop to print all the elements
        for (int i = 0; i < nums.length; i++) {
            for(int x: nums[i] ){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
