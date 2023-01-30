package class16.class16homework;
/*
2) Create a method that will take a String as a parameter and returns
reversed String. Method should be available to all classes
within your project and accessible by class name.
 */
public class ReversedMethod {

    public static String reverse(String s){
        StringBuilder r = new StringBuilder(s);
        return r.reverse().toString();
    }
}
