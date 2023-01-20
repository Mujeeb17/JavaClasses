package class11.class11homework;
/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.
 */
public class Sum {
    public static void main(String[] args) {

        int [][] n = {{2,4,6}, {12,14,16},{22,24,26}};
        int sum =0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                sum+=n[i][j];
            }
        }

        System.out.println(sum);
    }
}
