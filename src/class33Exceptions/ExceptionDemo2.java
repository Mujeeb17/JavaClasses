package class33Exceptions;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        System.out.println(1);

        try {

            System.out.println(2);
            System.out.println(10 / 0);
            System.out.println(3); // is never executed

        } catch (ArithmeticException e) {

            System.out.println(4);
            System.out.println(10 / 0); // there is no catch block for this line of code
                                        // so will cause another exception

            System.out.println(5); // is never executed

            //finally block will always be executed even if there is another exception
            //in catch block or not
        } finally {
            System.out.println("No matter what,this will be executed");
        }

        System.out.println("This will not be executed unless exception in catch block is fixed");
    }
}
