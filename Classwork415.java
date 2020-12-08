////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Bram Christie
// CSC 160 Computer Science I
// 9/16/2020
// Classwork 4.15
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* This program is designed to take a lower or upper case number from the user and return the corresponding
number on a phone keypad.
 */
import java.util.Scanner;
public class Classwork415 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompting the user to enter a character
        System.out.println("Enter a letter: ");
        // Moving string into next line
        String S1 = input.nextLine();
        // Using the charAt method to recognize the character the user input
        char ch = S1.charAt(0);
        // Converting the input character into upper case
        ch = Character.toUpperCase(ch);
        // Setting initial integer value to 0 to later set int value of character input
        int number = 0;
        if (Character.isLetter(ch))
        {
            /* List of character tests to determine which character the user entered and returns the corresponding
            number */
            if (ch >= 'W')
                number = 9;
            else if (ch >= 'T')
                number = 8;
            else if (ch >= 'P')
                number = 7;
            else if (ch >= 'M')
                number = 6;
            else if (ch >= 'J')
                number = 5;
            else if (ch >= 'G')
                number = 4;
            else if (ch >= 'D')
                number = 3;
            else if (ch >= 'A')
                number = 2;
            // Printing the correct number
            System.out.println("The corresponding number is " + number);
        }
        // If the user input anything other than an upper or lower case character, this error message appears
        else
            System.out.println(ch + " is an invalid input");
    }
}
