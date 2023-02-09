package class18or19ConstructorInheritanceThis;

public class This4 {

    int a, b;

    This4(int a, int b){
        this.a = a;
        this.b = b;
    }

    //void means we are not returning anything, we are just printing a statement
    public void sum (int a, int b){
        System.out.println("sum of local variables: " + (a + b));

        //using this. because the local and instance variables have the same name
        System.out.println("sum of instance variables: " + (this.a + this.b));
    }

    void hello(){
        System.out.println("Hello Batch 15");
    }
    void howAreYou(){
        System.out.println("How are you batch 15");
    }
    //creating a method that calls 2 other methods
    void greeting(){

        //this keyword refers to the instance methods (this keyword is not compulsory here)
        this.hello();
        this.howAreYou();
    }

    public static void main(String[] args) {

        This4 obj = new This4(10, 20);
        obj.sum(100, 200);

        System.out.println("*************");

        obj.greeting();
    }
}
