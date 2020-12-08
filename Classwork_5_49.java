///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Bram Christie
// CSC 160 Computer Science I
// 9/30/2020
// Classwork 5.49
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* This program os designed to read an input string from the user and then output how many vowels and consonants are
in that string
 */
import java.util.Scanner;
public class Classwork_5_49 {
    public static void main(String[] args) {
        // Creating a new Scanner and asking the user for a string.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        // Setting the # of vowels and consonants to 0 and defining them as variables.
        int vowels = 0, consonants = 0;
        // Converting the user input into lower case so that we can easily identify vowels and consonants.
        String scLower = sc.nextLine().toLowerCase();
        for (int i = 0; i < scLower.length(); i++) {
            char ch = scLower.charAt(i);
            // Picking out vowels in lower case and if there are any, incrementing the vowel variable by 1.
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            // Else statement that catches all other non-vowel characters and increments the consonants variable.
            else if ((ch >= 'a' && ch <= 'z')) {
                consonants++;


            }
        }
        // Printing the results of the vowel and consonants variables.
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);
    }
}