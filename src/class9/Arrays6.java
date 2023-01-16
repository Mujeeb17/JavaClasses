package class9;

public class Arrays6 {
    public static void main(String[] args) {

        double[] num = {10.5, 12.0, 45, 10.5, 23, 10.5};
        //write a program that can tell us how many times the number
        //10.5 is present in the array
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 10.5) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("********");

        //make the following array print "I Love Java"
        char[] letters = {'I', ' ', 'L', 'o', 'v', 'e', ' ', 'J', 'a', 'v', 'a'};
        System.out.print(letters);

        System.out.println();
        //another way to do it with a loop is
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }

    }
}
