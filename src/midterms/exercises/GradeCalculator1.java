 /**
 * Name: Morados, Lou Diamond, T.
 * Date: 10/03/2022
 * Name of Exercise: Midterm Demo Program 1

 OBJECTIVE:
 Create a program that has a method that is invoked by the main method

 Create a program that computes and displays the grade that is corresponding
 to a given score based on the following specifications:

 The grade is the integer value of (rawScore/perfectScore * 50 +50 )

 The perfectScore is an input by the program user at runtime.
 The perfectScore should be validated such that a perfectScore that is
     0 or negative should let the program user re-enter a valid perfectScore.

 The rawScore is an input by the program user at runtime.
 The rawScore should be validated such that a rawScore that is greater than the
   perfectScore should let the program user re-enter a valid rawScore.
   In addition, a rawScore that is less than 0 should let the program user
   re-enter a valid rawScore.

 The program execution will stop only if the user answers no to the question
    Do you want to compute another grade<Yes/No> ?

 Sample Run:

 Enter the perfect score: 0
 The perfect score should be greater than 0. Please enter a valid perfect score

 Enter the perfect score: 100

 Enter a raw score:   101

 The raw score cannot be higher than the perfect score.
    Please enter a valid raw score.

 Enter a raw score: -5

 The raw score cannot be lower than 0.
 Please enter a valid raw score.

 The raw score cannot be higher than the perfect score.
 Please enter a valid raw score. 90

 Grade = 95

 Do you want to compute another grade<Yes/No>: Yes

 Enter the perfect score: 10
 Enter a raw score:   5

 Grade = 95

 Do you want to compute another grade<Yes/No>: No
 * 
 * 
 */

 package midterms.exercises;

import java.lang.*;                                                                     // Imports java.lang library
import java.util.Scanner;                                                               // Imports Scanner class

public class GradeCalculator1{

    public static int GradeCalculate(int rawScore, int perfectScore, int grade ){
        grade = (int) ((double) rawScore / (double)perfectScore * 50 + 50);
        return grade;
    }

    public static void main(String[] args){
        
        int rawScore = 0, perfectScore = 0, grade = 50; 
        boolean computeAgain = true;                                                                                            // Initializes the variables
        String compute = "";

        Scanner kInput = new Scanner(System.in);                                                                        // Creates a Scanner object

        System.out.println("This programs computes the grade according to a raw score");                                    // Explains what the program does
        System.out.println("Based on the formula grade = rawScore/perfectScore*50 + 50.");

        while(computeAgain){

            do{                 // Start of do while
                System.out.print("Please enter a perfect score: ");
                perfectScore = Integer.parseInt(kInput.nextLine());
                if (perfectScore <= 0)                                                                                          // Prompts a message for user to respond to
                    System.out.println("Please input a number that is not less than or equal to zero");
            }while(perfectScore <= 0); // End of do while

            do{                 // Start of do while
                System.out.print("Please enter the raw score: ");
                rawScore = Integer.parseInt(kInput.nextLine());
                if (rawScore < 0){
                    System.out.println("Raw score cannot be below zero");                                                   // Prompts a message for user to respond to
                }else if(rawScore > perfectScore){
                    System.out.println("Raw score must not be higher than the perfect score");                                      
                }
            }while(rawScore < 0 || rawScore > perfectScore);   // End of do while   

            System.out.println(GradeCalculate(rawScore, perfectScore, grade));                                                          // Invokes another method to calculate passed variables

            boolean x = false;                                                                                              // Initiates a bool int for checking
            while(!x){                                                                                                      // While Loop
                    System.out.print("Would you like to compute again? [Yes/No] ");
                    compute = kInput.nextLine();
                    switch(compute){
                        case "yes", "Yes":
                            computeAgain = true;
                            x = true;
                            break;                                                                                  // Asks the user if they would like to compute again uses switch case to check
                        case "no", "No":
                            computeAgain = false;
                            x = true;
                            break;
                        default:
                            System.out.println("Please answer Yes or No \n\n\n\n");
                            x = false;

                    }                                                                   // End of Switch Case
            }                                                           // End of while loop                                                                                                  


        }       // End of While Loop



    }           // End of Method



}               // End of class