package class12StringClass;

public class StringDemo7StartsOrEndsWithContains {
    public static void main(String[] args) {

        String str = "I love java";

        //the method startsWith will check if a String starts with a letter we choose inside
        //the input brackets of the method ("I"), it will return a boolean
        //this method case-sensitive
        boolean startsWith = str.startsWith("I");
        System.out.println(startsWith);

        //the method endsWith is the same thing but with the last letter of the String
        boolean endsWith = str.endsWith("a");
        System.out.println(endsWith);

        //even though its case-sensitive, you combine it with the .toLowerCase() method
        //this is called method chaining
        System.out.println(str.toLowerCase().startsWith("i"));
        //will print true because we first converted the String to lowercase, and then
        //we are checking if the first letter starts with 'i'

        //method chaining only works when the method is returning a String type output
        //not an int output like length()

        //contains() method will return a boolean, it will check if a word is present in a String
        System.out.println(str.contains("java"));
    }
}
