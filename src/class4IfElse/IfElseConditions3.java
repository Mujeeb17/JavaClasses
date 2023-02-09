package class4IfElse;

public class IfElseConditions3 {
    public static void main(String[] args) {

        //in the "gutter" area (where all the line numbers are) you can
        //click beside the number so a red dot should appear
        //This will stop the execution of that line of code and all
        //lines of code after that (think of it as a STOP sign)
        //when you click on green triangle, click debug instead of run
        //you should a check on the red dot meaning that the code sucessfully stopped
        //at that line of code. (place red dot at the point where yoy want
        // to start seeing code execute one by one)
        //beside "debug" should be a blue arrow called 'step over'
        //clicking that will let java execute each line of code one by one

        int num1 = 20;
        int num2 = 10;

        if (num1 == num2) {
            System.out.println("numbers are equal");
        } else if (num1 > num2) {
            System.out.println("Number 1 is greater than number 2");
        } else if (num2 > num1) {
            System.out.println("Number 2 is greater than number 1");
        }
    }
}
