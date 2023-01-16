package class9.class9homework;
/*
4) Create an array that can store names of cars and
store 6 elements into it. Print all values from the array.
 */
public class CarNames {
    public static void main(String[] args) {

        String [] cars = {"Toyota","Honda","Hyundai","Mercedes","Subaru","Mclaren"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
