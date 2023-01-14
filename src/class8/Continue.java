package class8;
/*
The "continue" statement in Java is used to skip the current iteration of a loop vs
the "break" statement in java is used to terminate from the loop immediately.
 */
public class Continue {
    public static void main(String[] args) {

        //always use if conditions for break & continue statements otherwise it's an error

        //if we want to skip some numbers in the sequence, use continue
        for (int i = 1; i < 10; i++) {

            //we want to skip every number that is divisible by 3
            if(i%3 == 0){

                continue; //returns us to the start of for loop

            } else {
                System.out.println(i); //we print every number that's not divisible by 3
            }
            System.out.println("Hello Java");

        }
    }
}
