package class16.class16homework;
/*
2) Create a method that will take a String as a parameter and returns
reversed String. Method should be available to all classes
within your project and accessible by class name.
 */
public class ReversedMethod {

    //'public' keyword allows us to make this method available to all classes in this project
    //'static' allows us to call this method using just the class name (no object needed)
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
