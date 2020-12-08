////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Bram Christie
// CSC 160 Computer Science I
// 11/12/2020
// Classwork 8
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Classwork8 {
    public static void main(String[] args) {
    // Creating the Scanner and initializing the array
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 511: ");
    short n = input.nextShort();
    int[][] intArray = new int[3][3];

    short mask = 0b1;
    for (int i = 0; i < 9; i++) {
        short bit = (short) (n & mask);
        intArray[2-i / 3][2-i % 3] = bit;
        n = (byte) (n >> 1);

    }

    displayArray(intArray);

}

    public static void displayArray(int[][] array) {
    // Nested for loop and if statement that checks the results of the array that was built above
    // and displays the result in a 3 by 3 matrix
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (ints[j] == 1) {
                    System.out.print("T ");
                } else {
                    System.out.print("H ");
                }
            }

            System.out.println();
        }
    }

}

