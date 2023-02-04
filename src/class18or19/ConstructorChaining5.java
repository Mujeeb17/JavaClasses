package class18or19;

public class ConstructorChaining5{

    ConstructorChaining5(){
        System.out.println("I am non argument constructor");
    }

    ConstructorChaining5(String str){
        this(); // calling the constructor that has no parameters (Current class constructor)
                // this() - always must be on the first line

        System.out.println(str);
    }

    ConstructorChaining5(String str, int num){
        this(str); // calling the constructor with String parameter

        System.out.println("This is constructor with int parameter " + num);
    }

    public static void main(String[] args) {
        new ConstructorChaining5("Hi",7);
    }
}
