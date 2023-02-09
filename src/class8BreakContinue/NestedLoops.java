package class8BreakContinue;

public class NestedLoops {
    public static void main(String[] args) {

        //outer for loop
        for (int i = 0; i < 5; i++) { // will repeat the code inside this loop 5 times

            //inner for loop
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j); // will print numbers from 0 to 4
            }

            System.out.println("********"); //shows when outer loop is repeated again
        }
    }
}