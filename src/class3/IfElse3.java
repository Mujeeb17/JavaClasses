package class3;

public class IfElse3 {
    public static void main(String[] args) {

        char c='M';

        if (c ==  'M') {
            System.out.println("male");
        }

        String name="Sam";

        //relational operators don't work with strings
        //with non-primitive data types like String, we can't use == symbol
        //use following method
        if (name.equals("Sam")) {
            System.out.println("amazing student");
        }

        //example for "doesn't equal to" with strings
        if (!name.equals("Joe")) {
            System.out.println("who is joe??");
        }

    }
}
