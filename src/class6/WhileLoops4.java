package class6;

public class WhileLoops4 {
    public static void main(String[] args) {

        int n = 0;

        while (n < 10) {
            if (n % 2 == 0) {
                System.out.println("Even " + n);
            }
            n++;
        }
        System.out.println("*****************");


        //make sure numbers divisible by 5 are NOT printed
        int i = 1;
        while (i < 17) {
            if (!(i % 5 == 0)) {
                System.out.print(i + ", ");
            }
            i++;
        }

        System.out.println("\n************");
    }
}
