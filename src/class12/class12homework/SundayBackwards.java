package class12.class12homework;

public class SundayBackwards {
    public static void main(String[] args) {

        String day = "Sunday";

        System.out.print(day + " --> ");
        for (int i = day.length() - 1; i >= 0; i--) {
            System.out.print(day.charAt(i));
        }
    }
}
