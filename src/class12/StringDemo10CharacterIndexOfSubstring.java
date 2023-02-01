package class12;

public class StringDemo10CharacterIndexOfSubstring {
    public static void main(String[] args) {

        //this is the method for checking the amount of spaces in a String
        //  Character.isSpaceChar();

        String str = "Java is not pain";

        //this method will tell us the location/index of a character
        System.out.println(str.indexOf("J")); // will print 0 because "J" is in index 0

        //when multiple letters are present in a String, it will return the index of the
        //first time that letter appears
        System.out.println(str.indexOf("a")); // will print 1 because the first "a" is in index 1

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " has the index " + i);
        }
        System.out.println("*********");

        String str2 ="Send it to support channel. More java";
        // substring method lets us take part of a String form the beginning of a chosen index
        String newStr = str2.substring(5);
        System.out.println(newStr);

        //this line, we specify the start point and end point of the part of the string that we want to print
        System.out.println(str2.substring(0,27));

        //SHORTCUT: if you blue-highlight over text, intelliJ will tell you how many chars are in
        //there at the bottom right part of string
    }
}
