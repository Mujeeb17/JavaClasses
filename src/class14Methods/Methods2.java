package class14Methods;

public class Methods2 {

    //void = there is no assignment to a variable
    //the () is where we would pass input to this method
    void printHello(){
        System.out.println("Helloooo");
    }

    void printHelloManyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Heloooo");
        }
    }

    void printManyTimes(int num, String word){

        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }
    }
}
