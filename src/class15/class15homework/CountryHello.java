package class15.class15homework;
/*
4)Create a method that will say Hello in different language
based on the country that will passed when method is executed
 */
public class CountryHello {

    static String hello(String c){

        //NOTE: that break; statement is not needed because as soon
        //as the return statement is executed, the method is exited
        //so return does the same thing as break
        switch (c.toLowerCase()){
            case "canada":
            case "usa":
                return "hello";

            case "france":
                return "bonjour";

            case "italy":
                return "ciao";

            case "china":
                return "Ni hao";

            default:
                return "Country not supported";
        }
    }

    public static void main(String[] args) {

        System.out.println(hello("italy"));
    }
}
