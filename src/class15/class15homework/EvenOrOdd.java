package class15.class15homework;

/*
2) Create a method that will take a number and prints whether the number is even or odd.
 */
public class EvenOrOdd {

    static boolean isEven(int a){
        return a % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(isEven(5));
    }
}
