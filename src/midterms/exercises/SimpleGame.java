package midterms.exercises;

import java.util.Random;
import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rndNoGen = new Random(); // the Random class is in java.util package
        int secretNo = rndNoGen.nextInt(100) + 1; // generate a random number
        System.out.println("I have an integer from 1 to 100.");
        System.out.println("You have 3 chances to guess it.");
        int guessNo = 0;
        int guess;
        boolean gotIt = false;
        do {
            System.out.print("\nGuess #" + (guessNo + 1) + ": ");
            guess = Integer.parseInt(scan.nextLine());
            if (guess == secretNo) {
                gotIt = true;

                break; // terminate the loop immediately
            } else {
                if (guess > secretNo)
                    System.out.println("Try something lower.");
                else
                    System.out.println("Try something higher.");
                guessNo++;
            }
        } while (guessNo < 3);
        if (gotIt) {
            System.out.println("\nCongratulations!!!");
            System.out.println("Got it in " + guessNo + " trial(s)!");
        } else {
            System.out.println("\nSorry. No more guesses left.");
            System.out.println("The number is " + secretNo + ".");
            System.out.println("Better luck next time.");
        }
        System.out.println("\nThanks for playing!!!");
        System.out.println("Have a nice day :)!");
    } // end of main method
}