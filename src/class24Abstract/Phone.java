package class24Abstract;

public abstract class Phone {
    /*
    create a phone class and create abstract methods like displayPics
    unlockPhone
    sendText
    2 child classes: iPhone, Samsung, GooglePixel and give specific implementation
    lets write code to achieve runtime polymorphism
     */

    abstract void displayPics();
    abstract void unlockPhone();
    abstract void sendText();
}

class IPhone extends Phone{
    @Override
    void displayPics(){
        System.out.println("displaying pictures on iPhone");
    }
    @Override
    void unlockPhone(){
        System.out.println("unlocking iPhone");
    }
    @Override
    void sendText(){
        System.out.println("sending text from iPhone");
    }
}
class Samsung extends Phone{
    @Override
    void displayPics(){
        System.out.println("displaying pictures on Samsung");
    }
    @Override
    void unlockPhone(){
        System.out.println("unlocking Samsung");
    }
    @Override
    void sendText(){
        System.out.println("sending text from Samsung");
    }
}

class GooglePixel extends Phone{
    @Override
    void displayPics(){
        System.out.println("displaying pictures on Google Pixel");
    }
    @Override
    void unlockPhone(){
        System.out.println("unlocking Google Pixel");
    }
    @Override
    void sendText(){
        System.out.println("sending text from Google Pixel");
    }
}

class PhoneTester{
    public static void main(String[] args) {

        Phone[] p = {new IPhone(), new Samsung(), new GooglePixel()};
        for(Phone phone: p){
            phone.unlockPhone();
            phone.sendText();
            phone.displayPics();
        }
    }
}