package class11OOP.class11homework;
/*
5) Using 2D array create a grocery list. Inside you should have
an array of veggies, fruits, dairy and sweets. Retrieve all
values from that array using 2 different loops
*/
public class Grocery {
    public static void main(String[] args) {

        String [][] grocery = {{"Tomatoes","Kale"},{"Lemon","Strawberries"},{"milk","cheese"},{"donuts","cupcakes"}};

        for (int i = 0; i < grocery.length; i++) {

            if (i == 0) {
                System.out.println("Veggies:");
            } else if (i ==1){
                System.out.println("Fruits:");
            } else if (i == 2){
                System.out.println("Dairy:");
            } else if (i == 3){
                System.out.println("Sweets:");
            }

            for (int j = 0; j < grocery[i].length; j++) {
                System.out.println(grocery[i][j]);
            }
            System.out.println();
        }
    }
}
