package class33Exceptions.class33homework;

import java.util.ArrayList;
import java.util.List;

/*
2) Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try
and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.
 */
public class ExceptionList {

    public static List<Exception> exceptionList() {

        List<Exception> list = new ArrayList<>();

        NullPointerException npe = new NullPointerException();
        try {
            throw npe;
        } catch (NullPointerException e) {
            list.add(npe);
        }

        ClassNotFoundException cnfe = new ClassNotFoundException();
        try {
            throw cnfe;
        } catch (ClassNotFoundException e) {
            list.add(cnfe);
        }

        ArithmeticException ae = new ArithmeticException();
        try {
            throw ae;
        } catch (ArithmeticException e) {
            list.add(ae);
        }

        RuntimeException re = new RuntimeException();
        try {
            throw re;
        } catch (RuntimeException e) {
            list.add(re);
        }

        return list;
    }

    //    Call your method inside main and print name and details of all Exception objects.
    public static void main(String[] args) {

        for (Exception x : exceptionList()) {
            System.out.print("Name: ");

            if (x instanceof NullPointerException) {
                System.out.println("Null Pointer Exception");
                System.out.println("Thrown when an application attempts to use null in a case where an object is required.");

            } else if (x instanceof ClassNotFoundException) {
                System.out.println("Class Not Found Exception");
                System.out.println("Thrown when an application tries to load in a class through its string name but no definition for the class with the specified name could be found.");

            } else if (x instanceof ArithmeticException) {
                System.out.println("Arithmetic Exception");
                System.out.println("Thrown when an exceptional arithmetic condition has occurred. For example, an integer is divided by 0");

            } else if (x instanceof RuntimeException) {
                System.out.println("Runtime Exception");
                System.out.println("Runtime Exception is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.");

            }
            System.out.println();
        }
    }
}