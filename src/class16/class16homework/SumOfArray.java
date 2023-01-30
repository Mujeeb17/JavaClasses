package class16.class16homework;

/*
1) Create a method that will accept an array as parameters and will return a
sum of all elements from that array. Method should be visibly only within
same package and accessible by the creating an instance of the class.
 */
public class SumOfArray {

   static int sum(int[] a) {
        int sum = 0;
        for (int num: a) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {2,7,3,8,4};

        //if the method was not static, we would've had
        //to create an object to call the method even though
        //its in the same class
        System.out.println(sum(arr));
    }
}
