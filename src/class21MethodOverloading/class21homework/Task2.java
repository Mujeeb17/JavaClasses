package class21MethodOverloading.class21homework;

//purpose is to show that access modifiers aren't that important when Method overloading
public class Task2 {
    static void A(int a, int b) {
        System.out.println(a + b);

    }

    static void A(double a, int b) {
        System.out.println(a + b);
    }

    static void A(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        A(2, 5);
        A(4.00, 5);
        A(1, 2, 3);
    }
}

class Task3 {
    public void A(int a, int b) {
        System.out.println(a + b);

    }

    public void A(double a, int b) {
        System.out.println(a + b);
    }

    public void A(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Task2.A(2, 5);
        Task2.A(4.00, 5);
        Task2.A(1, 2, 3);
    }
}
