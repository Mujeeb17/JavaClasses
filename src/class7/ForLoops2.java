package class7;

public class ForLoops2 {
    public static void main(String[] args) {
        //print 1 2 4 5 7 8 10 11 13 14 16 17 19
        for (int i = 0; i <= 20; i++) {

            if (i % 3 != 0) { //evertime a number is divisible by 3, we don't want to print it
                System.out.print(i + " ");
            }
        }
        System.out.println("\n*********");

        //print 5 * every number between 1 and 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
}
