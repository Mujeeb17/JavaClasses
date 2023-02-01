package class12;

public class StringDemoAndChar9CharacterIs {
    public static void main(String[] args) {

        String str = "jdkksdnk 36872678 %^&^*(";

        //we want to count how many letters are in the String:
        //there is no method in String class to do this task so,
        //we can use a method thats inside the Character class
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))){
                count++;
            }
        }

        //we can also check how many numbers there are with the following method
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                count2++;
            }
        }

        System.out.println("Total isAlphabetic in str " + count);
        System.out.println("Total numbers in str " + count2);
    }
}
