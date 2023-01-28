package class15;

public class Methods4 {
    public static void main(String[] args) {

        System.out.println(doSomething());

        //return type and values we are returning from a method should match
        //we can only assign methods to variables of same type
        int num = doSomething();
    }

    //whenever you use 'void' keyword in a method, you can't use
    //'return' keyword. with 'void' all you can do is print something

    //whenever we specify the data type of a method (int),
    //the return value must also be the same type
    static int doSomething(){
        return 100;
    }
}
