package class25Interface;

public interface Moveable {
    void move();
}

interface OwnAble {
    void own();
}
//interfaces can support multiple inheritance (abstract can't)
class Car implements Moveable, OwnAble {
    @Override
    public void move() {
        System.out.println("Vroom Vroom");
    }
    @Override
    public void own(){
        System.out.println("I can own a car");
    }
}

class Dog implements Moveable, OwnAble{
    @Override
    public void move() {
        System.out.println("Woof woof *dog is moving*");
    }
    @Override
    public void own(){
        System.out.println("I can own a Dog");
    }
}