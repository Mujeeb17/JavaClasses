package class4;

public class NestIf2 {
    public static void main(String[] args) {

        int money = 1000;
        String day = "Sunday";
        boolean mood = true;

        //note how we tried to order the variables with most important first
        //money is more important than your mood
        //mood is more important than the day etc.

        if (money > 700) {

            if (mood) {

                if (day.equalsIgnoreCase("sunday")) {

                    System.out.println("lets go shopping");

                } else {
                    System.out.println("Try going on sunday");
                }

            } else {
                System.out.println("get in a good mood");
            }
        } else {
            System.out.println("lets save some money");
        }

    }
}
