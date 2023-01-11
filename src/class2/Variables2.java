package class2;

public class Variables2 {
    public static void main(String[] args) {

        //line below is reserving a box in the computer memory
        //we are calling it box1
        //if we need the info that we are storing in box1, we can
        //ask the computer to give us the content of box1
        //(int=) what type of data we want to store
        //(box1) is the name of the integer
        //(10) is what we are storing in box1

        int box1=10;
        System.out.println(box1);

        //to store whole numbers (no decimal pts) there are 4 diff data types
        //1) byte 2) short 3) int 4) long
        //we have 4 diff types because if we know the number we are storing is small, we
        //should use byte to save space/memory (why store a small num in a big box)

        //range for byte= -128 to 127
        //if storing larger numbers use short

        byte box2= 127;
        byte box3= -128;

        //range for short = -32768 to 32767
        //next bigger data type is int
        short box4= -32768;
        short box5= 32767;

        //whenever you make a long data type, you must put "l" at the end of the number

        long maxbox = 156757575658l;
        //int is most popular
        //no one really uses short, byte is common

        short myBox = 10000;
        System.out.println(myBox);

    }//end of main method

}//end of class
