package class11OOP;

public class OopCatTester {
    public static void main(String[] args) {

        //creating an object from the Cat class
        OopCat cat1 = new OopCat();

        //calling the methods from the Cat class
        cat1.sad();
        cat1.speak();
        cat1.mad();

        //now updating the variables we created in the Cat class
        cat1.name = "Joe";
        cat1.breed = "Van Cat";
        cat1.age = 2;
        cat1.colour = "Grey";
        cat1.attitude = false;

        //the cat class is like the template or design of a cat
        //this class is actually creating (an object) the cat: cat1

        System.out.println("***************");

        //now we can make another cat using the "template"
        OopCat cat2 = new OopCat();

        cat2.name="Bob";
        cat2.breed="Domestic";
        cat2.colour="White";
        cat2.age=3;

        cat2.mad();
        System.out.println("Bob is " + cat2.age + " years old");
    }
}
