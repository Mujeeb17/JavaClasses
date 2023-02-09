package class11OOP.class11homework;
/*
1) Create a Class “Phone”. Create 3 Objects of it:
iPhone, Pixel, Samsung with specific  attributes and behaviors.
*/
public class PhoneTester {
    public static void main(String[] args) {

        Phone iPhone = new Phone();
        iPhone.model="iPhone 11";
        iPhone.defaultBrowser="Safari";
        iPhone.storage=64;

        iPhone.power();
        iPhone.greeting();

        Phone Pixel = new Phone();

        Pixel.model="Pixel 5";
        Pixel.defaultBrowser="Chrome";
        Pixel.storage=80;

        Pixel.power();
        Pixel.email();

        Phone Samsung = new Phone();

        Samsung.model="Samsung S8";
        Samsung.defaultBrowser="Samsung internet";
        Samsung.storage=32;

        Samsung.power();
        Samsung.greeting();
    }
}
