package class11.class11homework;
/*
Create 2D array of countries: north america countries, south america countries,
europe countries, asian countries, african countries. Then print all values
from that array using 2 different loops and calculate how many total countries been stored
 */
public class Countries {
    public static void main(String[] args) {

        String [][] countries = {{"Canada","USA"},{"Brazil","Peru"},{"France","Spain"},{"India","Afghanistan"},{"Libya","Egypt"}};

        int count = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
                count++;
            }
            System.out.println();
        }
        System.out.println("Total countries stored: " + count);
    }
}
