package class10ForEach2DArray;
/*
Limitations of ForEach Loop
 */
public class ForEachLoop3 {
    public static void main(String[] args) {

        int [] nums = {10,13,20,25,45,50};

        //print only odd numbers from array with a regular for loop
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0){
                System.out.println(nums[i]);
            }
        }

        System.out.println("*********");

        //replace all the odd numbers with 0 in this array with a regular for loop
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0){
                nums[i] = 0;
            }
        }
        System.out.println("After replacing all odd numbers with zeros");
        for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }
    }

