package class4.class4homework;
import java.util.Scanner;
/*
TASK 5: Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print
“The temperature is the city  is ”
 */
public class CityTemperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter your city");
        String city = input.nextLine();

        System.out.println("please enter the temperature in fahrenheit");
        double tempF = input.nextDouble();

        double tempC = (tempF - 32) * 0.5556;

        System.out.println("the temperature in " + city + " is " + tempC + " degrees celsius");
    }
}
