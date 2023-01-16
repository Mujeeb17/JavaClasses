package class8.class8homework;
/*
5) Print the following pattern:
55555
4444
333
22
1
 */
public class Pattern {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {

            for (int j = i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
