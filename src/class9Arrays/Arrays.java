package class9Arrays;

public class Arrays {
    public static void main(String[] args) {

        //use when you need multiple variables

        //Arrays start with 0, 1, 2, 3....
        //so in the array, Slava = 0, Safi = 1, Jason = 2....
        //the index starts with 0
        String [] names = {"Slava","Safi","Jason","Nabi","Anees","Joseph"};

        //printing Safi from the array
        System.out.println(names[2]);

        //updating and printing value of variables
        names[3] = "GOOO";
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);

        System.out.println("*********");

        //loop that prints all names from array
        //names.length is the range of the array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("********");

        System.out.println(names.length); // prints the amount of variables thats' stored in the array

    }
}
