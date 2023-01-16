package class9.class9homework;
/*
5) Create an array of size 5 on integers and calculate
the sum of all elements in an array.

 */
public class FiveIntegers {
    public static void main(String[] args) {

        int [] num = new int[5];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        num[3]=40;
        num[4]=50;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
