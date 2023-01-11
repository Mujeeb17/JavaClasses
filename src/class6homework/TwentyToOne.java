package class6homework;

/*
Print even numbers from 20 to 1 (2 ways)
 */
public class TwentyToOne {
    public static void main(String[] args) {

        int i = 20;

        while (i > 1) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
            i--;
        }
        System.out.println("**********");
        int x = 20;
        while (x > 1) {
            System.out.println(x);
            x-=2;
        }

    }
}
