package class28ObjectClassAdvCastingLinkedListIterator.class28homework;

import java.util.ArrayList;

/*
2)Create an arraylist of cars and retrieve all the values using 3 different ways.
 */
public class Cars {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Hyundai");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Toyota");
        cars.add("Tesla");

        //1st way to retrieve values
        System.out.println(cars);

        //2nd way to retrieve values
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }

        System.out.println();

        //3rd way to retrieve values
        for (String c: cars){
            System.out.print(c + " ");
        }
    }
}
