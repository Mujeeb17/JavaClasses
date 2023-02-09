package class13StringClassStringbuilder;

public class ReplaceAllDemo {
    public static void main(String[] args) {

        String str = "hjsjkbJMKLMJIO1789-131273^&&*)(*%^&_";

        //replace all uppercase letters with a #
        System.out.println(str.replaceAll("[A-Z]","#"));

        //replace all lowercase letters with a @
        System.out.println(str.replaceAll("[a-z]","@"));

        //replace all numbers from 0 to 9 with &
        System.out.println(str.replaceAll("[0-9]","&"));

        //replace all letters with $
        System.out.println(str.replaceAll("[A-Za-z]","*"));

        //replace everything EXCEPT for letters and numbers
        System.out.println(str.replaceAll("[^A-Za-z0-9]","^"));

        //if you want to remove something from a String, leave "replacement" as ""
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
    }
}