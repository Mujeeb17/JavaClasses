package class11.class11homework;

/*
1) Create a Class “Phone”. Create 3 Objects of it:
iPhone, Pixel, Samsung with specific  attributes and behaviors.
*/
public class Phone {

    String model;
    String defaultBrowser;
    double storage;

    void power() {
        System.out.println("*TURN ON*");
    }

    void greeting() {
        System.out.println("Hey how are you");
    }

    void email() {
        System.out.println("*Email notifications");
    }
}
