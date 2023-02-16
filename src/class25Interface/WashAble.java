package class25Interface;

interface WashAble {
    //for interfaces, we don't use abstract keyword because its all
    //assumed to be abstract (same with public)
    public abstract void wash();

    static void m1(){ // using static keyword (only) allows us to call the method by the interface name
                      // if we remove 'static' java will not allow us to make the body because it is by default abstract
        System.out.println("hello world");
    }

    default void m2(){ // using default keyword

    }
    private void m3(){}
}
class SmartWatch implements WashAble{
    @Override
    public void wash(){ // this will give error if it wasn't public because
                        // all methods in interface are automatically public
        System.out.println("I'm IP65 rated you can wash me");
    }
}

class Phone implements WashAble{
    public void wash(){
        System.out.println("I'm IP65 rated you can wash me");
    }
    void turnOn(){
        System.out.println("Press power to turn me on");
    }
}
class Inverter implements WashAble{
    public void wash(){
        System.out.println("I'm IP65 rated you can wash me");
    }
}