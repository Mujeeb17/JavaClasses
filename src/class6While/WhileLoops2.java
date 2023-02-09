package class6While;

public class WhileLoops2 {
    public static void main(String[] args) {

        int num = 1;
        while (num < 5) {
            System.out.print(num + ", ");
            num++;
        }

        System.out.println("\n*********");

        int num2 = 0;
        while (num2 < 10) {
            System.out.print(num2 + ", ");
            num2 += 2;
        }

        System.out.println("\n*********");

        //write a loop that prints numbers 1 to 100
        int num3 = 1;
        while (num3 <= 100) {
            System.out.print(num3 + ", ");
            num3++;
        }
        System.out.println("\n*********");

        //write a loop that prints numbers odd numbers from 1 to 15
        int num4 = 1;
        while (num4 <= 15) {
            System.out.print(num4 + ", ");
            num4 += 2;
        }
        System.out.println("\n*********");

        //write a loop that prints numbers 5,10,15,20... till 50
        int num5 = 5;
        while (num5 <= 50) {
            System.out.print(num5 + ", ");
            num5 += 5;
        }
    }
}
