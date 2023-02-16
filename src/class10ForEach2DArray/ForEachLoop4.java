package class10ForEach2DArray;
//Limitations of for each loop
public class ForEachLoop4 {
    public static void main(String[] args) {

        int [] nums = {10,13,20,25,45,50};
        //we can't update the elements in for each loop
        //because we don't have access to the index

        //we can only print the data with a for each loop,
        //we cant update it
        for (int x : nums) {
            System.out.println(x);
        }

    }
}
