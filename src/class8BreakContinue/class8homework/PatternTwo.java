package class8BreakContinue.class8homework;
/*
6) Print the following pattern:
*

*

*
**
*
**
*
 */
public class PatternTwo {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            if(i % 2 != 0){
                System.out.println("*");
            } else if (i == 2 || i == 4){
                System.out.println();
            } else if (i == 6 || i == 8){
                System.out.println("**");
            }
        }
    }
}
