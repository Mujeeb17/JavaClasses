package class2.class2homework;

/*
TASK 5: Write a program to print the area and perimeter
of a rectangle with width = 5 and  height = 8
 */
public class Task5AreaPerimeter {
    public static void main(String[] args) {

        //declaring and assigning height & width
        double h = 8;
        double w = 5;

        //creating variables that store the area and perimeter
        double a = (h * w);
        double p = (2 * (h + w));

        //printing required statements
        System.out.println("The perimeter of a rectangle with a width of " + w + " and height of " + h + " is equal to " + p + " and area is " + a);

    }//end of main method
}//end of class
