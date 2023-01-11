package class5;

public class LogicalOperators {
    public static void main(String[] args) {

        //logical operators are just another set of symbols that we
        //can use to combine many boolean values to make a boolean condition
        //logical operators: (!) (||) (&&)
        // ! means NOT
        // || means OR
        // && means AND

        System.out.println(!true); // prints false
        System.out.println(!false); // prints true

        boolean rich = true;
        System.out.println(!rich);

        int num = 5;
        if (num >= 1 && num <= 9) {
            System.out.println("You need help");
        } else {
            System.out.println("you still need help");
        }

        int num2 = 8;
        if (num!=5) {
            System.out.println("the number you picked is not 5");
        } else {
            System.out.println("why did you pick 5");
        }

        String country = "Canada";
        if(!country.equals("Canada")) {
            System.out.println("you dont live in canada woahhh");
        } else {
            System.out.println("you live in canada woahh");
        }




    }
}
