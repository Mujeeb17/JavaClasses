package class14Methods;

public class ReturnDemoTester {
    public static void main(String[] args) {

        ReturnDemo rd = new ReturnDemo();

        //because we used 'return' we are able to
        //store what the method is returning into a variable
        String hi = rd.str();

        //methods that are 'void' can only print things

        System.out.println(hi);
    }
}
