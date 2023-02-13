package class23PolymorphismFinal.class23homework;
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */
public class Computer {

    int RAM, storage;
    String OS;
    void playVideo(){
        System.out.println("Video is playing");
    }
    void browseInternet(){
        System.out.println("Browsing internet");
    }
}

class Apple extends Computer {
    @Override
    void playVideo() {
        System.out.println("Video is playing on apple device");
    }

    @Override
    void browseInternet() {
        System.out.println("browsing internet on apple device");
    }

    void editVideos(){
        System.out.println("editing on iMovies");
    }
    void installApp(){
        System.out.println("installing apps form App Store");
    }
}

class Lenovo extends  Computer{
    @Override
    void playVideo() {
        System.out.println("Video is playing on lenovo device");
    }

    @Override
    void browseInternet() {
        System.out.println("browsing internet on lenovo device");
    }
    void thinkVantage(){
        System.out.println("Running ThinkVantage on lenovo");
    }
}
class HP extends  Computer {
    @Override
    void playVideo() {
        System.out.println("Video is playing on HP device");
    }

    @Override
    void browseInternet() {
        System.out.println("browsing internet on HP device");
    }
    void installApp(){
        System.out.println("You can install any apps on me");
    }
}
class Dell extends Computer{
    @Override
    void playVideo() {
        System.out.println("Video is playing on Dell device");
    }

    @Override
    void browseInternet() {
        System.out.println("browsing internet on Dell device");
    }
}