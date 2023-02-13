package class3IfElseTypeCasting;

public class RelationalOperators {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;
        System.out.println(num1 + num2);

        //since we assigned the value of result as a true statement, it will print true
        boolean result = 20 > 10;
        System.out.println(result);

        /*relational operators
        >
        =>
        ==
        != (means 'not equal to')
        <
        =<
        &&
         */

        System.out.println(20 > 10); //is 20 greater than 10
        System.out.println(20 < 10); //is 20 less than 10
        System.out.println(5 != 10); //is 5 not equal to 10 (true)
        System.out.println(5 == 10); //is 5 equal to 10 (false)
        System.out.println(5 == 5); // is 5 equal to 5

        String a, b;
        a = "joe";
        b = "joe";
        System.out.println(a==b);
    }
}
