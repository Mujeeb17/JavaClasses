package class12;

public class StringDemo5 {
    public static void main(String[] args) {

        String str = "Java";
        String str2 = "Java";

        //the equals() method is one we've used before
        //checks if both Strings are the same and will return a boolean
        //this method is case-sensitive.

        boolean areEqual = str.equals(str2);
        System.out.println(areEqual); //will print true

        //a way to get around the case sensitivity of the equals() method is by
        //using equalsIgnoreCase
        String str3 = "JAVA";

        boolean isEqual = str.equalsIgnoreCase(str3);
        System.out.println(isEqual); // will print true
    }
}
