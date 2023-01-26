package class13.class13homework;
/*
2) Create a String that should be combination of letters,
numbers and special characters. Find out how many Alphanumeric(abd AZ 284)
characters are there in the String.
 */
public class CountLetters {
    public static void main(String[] args) {

        String s = "Hello1234!@#$";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))){
                count++;
            } else if (Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        System.out.println("Alphanumeric characters: " + count);


        //Another way to solve: remove all special characters then count all characters in new String
        // System.out.println(s.replaceAll("[^A-Za-z0-9]", "").length());

    }
}
