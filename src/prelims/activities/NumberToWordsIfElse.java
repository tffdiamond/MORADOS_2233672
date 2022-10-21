package prelims.activities;
/**
 * Name: Lou Diamond T. Morados
 * Date: 9/21/2022
 * Module 3 Activity
 *
 * Problem: Create a program that converts a number into word in the range of 1 to 100
 *
 * Algorithm:
 *
 * Input:
 * - arbitrary number in the range of 1 to 100
 *
 * Output:
 * - the english word of that inputted number
 *
 * Process:
 * 1. Create an object of scanner class
 * 2. Declare a variable that store the input value of the user
 * 3. Take the input value of the user
 * 4. Subject the inputted value to the parameter of an if-else statement
 * 5. Print the block of code of the if-else statement that satisfies the parameter
 * 6. Convert the number into an english word
 */
import java.util.Scanner;

public class NumberToWordsIfElse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Please input a value in the range of 1 to 10: ");
        num = Integer.parseInt(keyboard.nextLine());
        if (num == 1) System.out.println("One");
        else if (num == 2) System.out.println("Two");
        else if (num == 3) System.out.println("Three");
        else if (num == 4) System.out.println("Four");
        else if (num == 5) System.out.println("Five");
        else if (num == 6) System.out.println("Six");
        else if (num == 7) System.out.println("Seven");
        else if (num == 8) System.out.println("Eight");
        else if (num == 9) System.out.println("Nine");
        else if (num == 10) System.out.println("Ten");
        else System.out.println("Invalid Number");

    }
}
