package class10;

public class EnhancedForLoop {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};

        //'number' is just a variable name
        //it will take every value from the array and print them each one by one
        //this only works with arrays... for now
        for(int number: nums){
            System.out.println(number);
        }
        //whenever possible, use enhanced for loop
    }
}
