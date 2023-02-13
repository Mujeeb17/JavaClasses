package class23PolymorphismFinal.class23homework;

/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */
public class ComputerTester {
    public static void main(String[] args) {

        Computer[] device = {new Apple(), new Lenovo(), new HP(), new Dell()};

        for (Computer x : device) {
            x.playVideo();
            x.browseInternet();
        }

        System.out.println("***********");

        //if i want to call a method that's specific to a child class i would
        //have to convert the 'Computer' to 'Apple' through type casting

        for (Computer c : device) {
            c.playVideo();
            c.browseInternet();

            //this is above current learning level

            //checking if c is an instance of the Apple class, then we
            //type cast it to an apple class, so we could call the methods that are only
            //available inside the apple class
            if (c instanceof Apple) {
                Apple apple = (Apple) c; // converting the variable c back to an apple object
                ((Apple) c).editVideos();
                ((Apple) c).installApp();
                System.out.println();
            }
            //this could be repeated for the other 4 subclasses
        }
    }
}
