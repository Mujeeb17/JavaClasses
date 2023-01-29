package class15.class15homework;

//5) Write a method to return whether given number is prime or not?
public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(isPrime(5));
    }

    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if ((a % i) == 0) {
                return false;
            }
        }
        return true;
    }

}
