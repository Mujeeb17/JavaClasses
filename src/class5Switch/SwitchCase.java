package class5Switch;

public class SwitchCase {
    public static void main(String[] args) {

        // this block of code would be easier to make
        // with the use of switch

        //COOL TIP: move your cursor to the first if statement,
        //the lightbulb will have an option to change the whole
        //code into a switch case
        int day = 1000;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong day");
        }

        //now using switch for same purpose of code
        //using switch is better because of cleaner code and
        //faster execution
        int dayNew = 1;
        switch (dayNew) {
            case 1:
                System.out.println("Monday");
                break; //we use 'break' so it doesn't execute the code in case 2

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default: //default is basically 'else' its optional
                System.out.println("Wrong day");
        }
    }
}
