package class14;

public class Methods {
    public static void main(String[] args) {

        int[] arr = {3,9,9,2,5};

        System.out.println(sum(arr));

    }

    //creating a method that will calculate the sum of integers in an array
    public static int sum(int[] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum+= x[i];
        }
        return sum;
    }
}
