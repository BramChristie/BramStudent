/////////////////////////////////////////////////////////////////////////////////////////////////////////
// Bram Christie
// CSC 160 Computer Science I
// 9/10/2020
// Classwork 3.10
/////////////////////////////////////////////////////////////////////////////////////////////////////////
/* This program was originally a subtraction quiz but has been reworked into an addition quiz for the sake of
study and practice*/
import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Generating 2 numbers between 1 and 100.
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        /* The following statement makes sure that the larger number is put first but this was left over from the
        subtraction quiz. */
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        // Asking for the answer to the new addition question.
        System.out.print(
                "What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        /* Making sure that the answer is correct and if not printing the statement saying it's not and showing
         the correct answer*/
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("Your answer is wrong. " + number1 + " + " + number2
                    + " should be " + (number1 + number2));
    }
}