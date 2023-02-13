package class3IfElseTypeCasting.class3homework;

/*
TASK 2: create a variable to store temperature. program should check
if temperature is below 32 then it should print
"water will freeze with temperature" otherwise print
"water will not freeze with temperature"
 */
public class TemperatureCheck {
    public static void main(String[] args) {

        double temp = 35;

        if (temp < 32) {
            System.out.println("water will freeze with temperature");
        } else {
            System.out.println("water will not freeze with temperature");
        }
    }
}
