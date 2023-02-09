package class12StringClass;

public class CarTester {
    public static void main(String[] args) {

        //calling car class and creating 'car1' object
        Car bmw = new Car();

        bmw.make="BMW";
        bmw.model="i7";
        bmw.colour="grey";
        bmw.year=2023;
        bmw.brakes();

        Car audi = new Car();

        audi.model="E-tron";
        audi.make="Audi";
        audi.year=2022;
        audi.colour="Black";
        audi.moveForward();
    }
}
