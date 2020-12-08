/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Bram Christie
// CSC 160 Computer Science I
// 9/3/2020
// Classwork 2.1
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// This program is designed to take a double value from the user that represents a temperature in Celsius and
// converts the double value into another double value that represents Fahrenheit
import java.util.Scanner;

public class temp {

    public static void main(String[] args) {
        // Creating a Scanner that takes a Celsius value from the user with newTemp scanner
        Scanner newTemp = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        // Converting the Celsius double value into a Fahrenheit double value with nextFloat method
        double C = newTemp.nextFloat();
        double F = C * (9f / 5) + 32;
        // Prints out the converted Double value of C into F
        System.out.println(C + " Celsius is " + F + " Fahrenheit.");

    }
}