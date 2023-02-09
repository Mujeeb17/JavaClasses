package class8BreakContinue;

public class NestedLoops2 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) { //outer for loop

            for (int j = 0; j < 5; j++) { //inner for loop

                if (j == 1 || j == 2){ //because we are 'skipping'/'continuing' 2 iterations are skipped
                    continue;
                }
                System.out.print("* "); //inner for loop controls how many STARS we print on the line
            }
            System.out.println(); //outer for loop controls how many LINES we print
        }
    }
}
