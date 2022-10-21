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
 * 4. Subject the inputted value to the switch-case statement
 * 5. Print the block of code of the switch-case that satisfies the parameter
 * 6. Convert the number into an english word
 */
import java.util.Scanner;

public class NumberToWordsSwitchCase {
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);
        num = Integer.parseInt(keyboard.nextLine());
        switch (num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Invalid Number");

        }
    }
}
