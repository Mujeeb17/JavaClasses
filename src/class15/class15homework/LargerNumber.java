package class15.class15homework;

/*
1) Create a method that will take 2 parameters as a numbers and prints which number is larger.
 */
public class LargerNumber {

    static int larger(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        System.out.println(larger(2,6));
    }
}
