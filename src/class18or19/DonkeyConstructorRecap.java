package class18or19;
public class DonkeyConstructorRecap {

    //instance variables
    String name;
    int age;

    void print(){
        System.out.println("Donkey name is " + name + " and age is " + age);
    }

    //creating a constructor with parameters
    DonkeyConstructorRecap(String n, int a){
        name = n;
        age = a;
    }

    //creating a constructor with no parameters that sets a default value for name and age
    DonkeyConstructorRecap(){
        name = "John";
        age = 99;
    }

    public static void main(String[] args) {

        //creating a constructor and printing out default values (but we are not storing this constructor)
        new DonkeyConstructorRecap().print(); //this is example of a default constructor created
                                                // by the compiler when a programmer doesn't create one

        DonkeyConstructorRecap donkey1 = new DonkeyConstructorRecap("Huluu", 21);
        donkey1.print();
    }
}
