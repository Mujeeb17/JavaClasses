package class13StringClassStringbuilder;

public class StringRecap {
    public static void main(String[] args) {

        //How can you print all the letts from this string one by one
        String str = "Java is Great";

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }

        System.out.println();

        //count how many times 'a' appears
        int count =0;
        for (int i = 0; i < str.length(); i++) {

            //we dont use .equals because we are dealing with char
            if(str.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("letter 'a': " + count);

    }
}
