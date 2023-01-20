package class11.class11homework;
/*
Create a 2D array or integer type where you will store odd and even
numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
 */
public class EvenNumbers {
    public static void main(String[] args) {

        int [][] n = {{2,3,7,9},{4,10,12,13},{21,27,1,8}};

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if(n[i][j] % 2 ==0){
                    System.out.println(n[i][j]);
                }
            }
        }
    }
}
