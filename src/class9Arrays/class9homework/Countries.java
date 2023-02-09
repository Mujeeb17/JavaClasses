package class9Arrays.class9homework;
/*
6) Create an array of countries. While retrieving all
values from an array print capital for each country choose any five countries.
 */
public class Countries {
    public static void main(String[] args) {

        String[] countries = {"Portugal", "Jamaica", "Columbia", "Cambodia", "Malta"};
        String[] capital = {"Lisbon", "Kingston", "Bogota", "Phnom Penh", "Valletta"};

        for (int i = 0; i < countries.length; i++) {
            System.out.println("The capital of " + countries[i] + " is " + capital[i]);
        }
    }
}
