package class15.class15homework;
/*
4)Create a method that will say Hello in different language
based on the country that will passed when method is executed
 */
public class CountryHello {

    static String hello(String c){

        String h = "";
        if (c.equalsIgnoreCase("Canada") || c.equalsIgnoreCase("USA")){
            h = "hello";
        } else if (c.equalsIgnoreCase("France")){
            h = "bonjour";
        } else if (c.equalsIgnoreCase("Italy")){
            h = "ciao";
        }
        return h;
    }

    public static void main(String[] args) {

        System.out.println(hello("italy"));
    }
}
