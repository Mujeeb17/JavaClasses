package class18or19ConstructorInheritanceThis;

public class StoreThis3 {

    public static void main(String[] args) {

        //making an object from furniture class
        //'table' is the reference variable (refers to the object we created)
        FurnitureThis2 table = new FurnitureThis2("Table", 100, "white");
        table.print();

        //just to show that we can make a variable from the class:
        FurnitureThis2 chair;

        //now creating an object from the reference variable
        //everytime we use 'new' keyword, we are creating an object
        chair = new FurnitureThis2("Chair", 40.4, "black");
    }
}
