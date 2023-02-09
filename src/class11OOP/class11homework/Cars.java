package class11OOP.class11homework;

/*
4) Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops
*/
public class Cars {
    public static void main(String[] args) {

        String[][] cars = {{"Cadillac", "GMC", "Dodge"}, {"Volkswagen", "Audi", "BMW"}, {"Hyundai", "Kia"}, {"Ferrari", "Fiat"}};

        for (int i = 0; i < cars.length; i++) {

            if (i == 0) {
                System.out.println("American Cars:");
            } else if (i ==1){
                System.out.println("German cars:");
            } else if (i == 2){
                System.out.println("Korean cars:");
            } else if (i == 3){
                System.out.println("Italian cars:");
            }

            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);
            }
            System.out.println();
        }
    }
}
