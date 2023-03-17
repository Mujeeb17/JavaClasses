package class33Exceptions;

public class ExceptionDemo1 {
    public static void main(String[] args){

        String name = null;

        try {
            System.out.println(name.length());
        } catch (NullPointerException npe){
            System.out.println("name is empty");
        }

    }
}
