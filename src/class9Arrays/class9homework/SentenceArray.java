package class9Arrays.class9homework;

/*
3) Create an array of words: Java, Saturday, day, coding, is.
Print the following sentence using elements of array: “Saturday is Java coding Day”.
 */
public class SentenceArray {
    public static void main(String[] args) {

        String[] java = {"Saturday ", "is ", "Java ", "coding ", "Day"};

        for (int i = 0; i < java.length; i++) {
            System.out.print(java[i]);
        }
    }
}
