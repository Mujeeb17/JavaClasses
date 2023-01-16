package class8.class8homework;
/*
1) Print numbers from 1 to 50 except those that are divisible by 3
 */
public class OneToFifty {
    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
