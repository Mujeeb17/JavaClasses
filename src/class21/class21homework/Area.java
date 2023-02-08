package class21.class21homework;

public class Area {

    void area(double a, double b){
        System.out.println(a*b);
    }

    void area(double a){
        System.out.println(a*a);
    }
}

class AreaTester{
    public static void main(String[] args) {

        Area a = new Area();

        a.area(10);
    }
}