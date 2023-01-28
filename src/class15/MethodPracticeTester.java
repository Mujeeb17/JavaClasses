package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice method = new MethodPractice();

        System.out.println(method.isEven(100));

        System.out.println(method.reverseStr("Reverse this"));
        //NOTE: if you want to debug a method, press 'step into' when you
        //get to the line code in the main method that is calling the method
    }
}
