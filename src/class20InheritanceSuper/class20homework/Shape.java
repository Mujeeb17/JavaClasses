package class20InheritanceSuper.class20homework;
/*
1. Write program: Shape class has a constructor that takes the
radius and has a subclass as  circle class. In circle class create
a method to calculate the area of circle. Test your code
 */
public class Shape {

    double rad;

    Shape(double rad){
        this.rad=rad;
    }
}

class Circle extends Shape{

    Circle(double rad) {
        super(rad);
    }

    double area(){
        return ((3.14 * (super.rad * super.rad)));
    }
}

class AreaTest {

    public static void main(String[] args) {

        Circle m = new Circle(2);

        System.out.println(m.area());
    }
}
