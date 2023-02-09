package class9Arrays;

public class Arrays3 {
    public static void main(String[] args) {

        char[] letters = {'A', 'B', 'c', 'd', 'e', 'F'};

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        //updating one index from array
        letters[1]='b';
    }
}
