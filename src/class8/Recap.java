package class8;

public class Recap {
    public static void main(String[] args) {

        //use while, do while, and for loops to print the sequence 10 8 6 4 2

        int i = 10;
        while (i > 1){
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }

        System.out.println("\n**********");

        int y = 10;
        do {
            System.out.print(y + " ");
            y-=2;
        } while (y > 1);

        System.out.println("\n***********");

        for (int x=10; x > 1 ; x-=2){
            System.out.print(x + " ");
        }

        //shortcut for for loop = "fori"
        //this just initialises it
    }
}
