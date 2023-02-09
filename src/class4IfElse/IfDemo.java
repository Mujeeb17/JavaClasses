package class4IfElse;

public class IfDemo {
    public static void main(String[] args) {

        int money = 15000;

        if (money > 1000) {
            System.out.println("lets buy iphone");
        }
        if (money > 2000) {
            System.out.println("buy a macbook");
        }

        boolean momDay = true;

        if (momDay) {

            System.out.println("happy mother's day");
        }

        String name = "bob";
        if (name.equalsIgnoreCase("BOB")) {
            System.out.println("name is bob");
        }

    }
}
