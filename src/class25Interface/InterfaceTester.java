package class25Interface;

public class InterfaceTester {
    public static void main(String[] args) {

        //achieving polymorphism with the 2 interfaces
        WashAble[] wa = {new SmartWatch(), new Phone(), new Inverter()};
        for(WashAble x: wa){
            x.wash();
        }
        WashAble.m1();

        System.out.println();

        Moveable[] ma = {new Car(), new Dog()};
        OwnAble[] oa = {new Car(), new Dog()};
        for (int i = 0; i < ma.length; i++) {
            ma[i].move();
            oa[i].own();
        }
    }
}

