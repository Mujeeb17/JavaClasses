package class6.class6homework;
/*
Print odd numbers between 20 and 50 (2 ways)
 */
public class TwentytoFifty {
    public static void main(String[] args) {

        int i = 20;
        while (i >= 20 & i <= 50){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("**********");
        int x = 21;
        while (x >= 20 && x <= 50){
            System.out.println(x);
            x+=2;
        }
    }
}
