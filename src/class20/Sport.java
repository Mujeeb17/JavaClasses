package class20;

//practicing super

public class Sport {

    String name, country;

    Sport(String name, String country){
        this.name = name;
        this.country = country;
    }

    public void display(){
        System.out.println(name + " is played in " + country);
    }
}

class Cricket extends Sport{

    String helmet;

    Cricket(String name, String country, String helmet){
        //super() - must always be on the first line
        super(name, country); // referring to PARENT class constructor

        this.helmet = helmet; // referring to CURRENT class
    }

    void cricketDisplay(){
        display();
        System.out.println("Using " + helmet);
    }
}

class Soccer extends Sport {

    String ball;

    Soccer(String name, String country, String ball){
        super(name, country);

        this.ball = ball;

    }

    void soccerDisplay(){
        display();
        System.out.println("Using " + ball);
    }
}