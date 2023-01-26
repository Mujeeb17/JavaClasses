package class13.class13homework;

/*
4) How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
 */
public class ReverseSentence {
    public static void main(String[] args) {

        String s = "This is sentence i want to reverse";

        String[] strArr = s.split(" ");

        for (String word : strArr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
        System.out.println();

        //Another way to solve this is convert each word in the array to a StringBuilder
        for (String word: strArr) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
    }
}
