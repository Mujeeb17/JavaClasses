package class18or19;

public class FurnitureThis2 {

    String type;
    double price;
    String color;

    //using constructor, we can initialise object with specific values
    FurnitureThis2(String type, double price, String color){

        //using this keyword to refer to the instance variable
        this.type = type;
        this.price = price;
        this.color = color;
    }

    void print(){
        System.out.println(type + " is " + price + " and is " + color);
    }

    public static void main(String[] args) {

        new FurnitureThis2("chair", 150, "Blacky").print();
    }
}
