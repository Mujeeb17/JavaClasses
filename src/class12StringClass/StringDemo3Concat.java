package class12StringClass;

public class StringDemo3Concat {
    public static void main(String[] args) {

        String fName = "Akhter";
        String lName = "Lava";

        //This is one way to combine the 2 Strings
        System.out.println(fName + " " + lName);

        //Another way to combine is store in a new variable
        String fullName = fName + " " + lName;
        System.out.println(fullName);

        //There is a method to do this in String class however it is rarely used
        System.out.println(fName.concat( " " + lName));

        //The brackets inside .concat() is where we pass input. some methods need them like this one
        //other methods don't like toLowerCase
    }
}
