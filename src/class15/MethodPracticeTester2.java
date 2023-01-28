package class15;

public class MethodPracticeTester2 {
    public static void main(String[] args) {

        MethodPractice2 method = new MethodPractice2();

        int[] arr = {2,7,4,9,3};

        System.out.println(method.sum(arr));

        System.out.println("The larger number is: " + method.larger(7,4));

        System.out.println(method.printSchool());
    }
}
