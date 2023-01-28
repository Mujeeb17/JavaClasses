package class15;

public class MethodPractice2 {

    //create a method that takes an array of int, sum all elements
    //and return sum

    int sum(int[] a){
        int s = 0;
        for (int num: a) {
            s += num;
        }
        return s;
    }

    //create a method that takes two numbers as parameters,
    //and returns the larger number
    int larger(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    //create a method that doesn't take any parameters and
    //returns a String "Syntax". name the method "printSchool"
    String printSchool(){
        return "Syntax";
    }
}
