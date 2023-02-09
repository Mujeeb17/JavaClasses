package class15VariableTypesMethod;

public class MethodPractice {

    //create a method which returns true/false and take the int
    //numbers as input, if int = even, true. else = false
    boolean isEven(int a){
        return a % 2 == 0;
    }

    //create a method that takes a String, reverse it and
    //return the reversed String
    String reverseStr(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
