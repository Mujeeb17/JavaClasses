package class18or19ConstructorInheritanceThis.homework;
/*
Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */
public class Book {
    String name;
    int pages;

    Book(String name){
        this.name = name;
    }
    Book(String name, int pages){
        this(name);
        this.pages = pages;
    }
    void display(){
        System.out.println(name + pages);
    }

    public static void main(String[] args) {
        new Book("Book of Book ", 286).display();
    }
}
