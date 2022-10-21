package prelims.activities;
/**
 * Name: Lou Diamond T. Morados
 * Date: 9/21/2022
 * Module 3 Activity
 *
 * Problem: Create a program that inputs 3 exam grade using BufferedReader and involves JOptionPane
 *
 * Algorithm:
 *
 * Input:
 * - First Exam Grade
 * - Second Exam Grade
 * - Third Exam Grade
 *
 * Output:
 * - Remarks for the average of three exam grade
 *
 * Process:
 * 1. Create an object BufferedReader class for the inputs
 * 2. Declare variables which stores the value of the inputs from the BufferedReader object (firstExamGrade,
 * secondExamGrade, thirdExamGrade)
 * 3. Declare variables that is used to JOptionPane (validAmount, inputString, stringToDisplay)
 * 4. Create JoptionPane that shows the purpose of the program
 * 5. Construct a try-catch and if-else statement within the while loop
 * 6. Take the input values from the user
 * 7. Calculate the average of the three exam grade: average = firstExamGrade + secondExamGrade + thirdExamGrade / 3
 * 8. Create if-else statements that subject the average of the three exam grade
 * 9. Print the output using println that is in the body of each if-else statement if the average of three
 * exam grade satisfies each parameter of if-else statement
 */
import javax.swing.*;
import java.awt.*;

public class GradesJoptionPane {
    public static void main(String[] args) {
        boolean validAmount = false;
        boolean valid = false;
        int value;
        String inputString;
        String stringToDisplay1="";
        StringBuilder stringToDisplay = new StringBuilder();
        int firstExamGrade, secondExamGrade, thirdExamGrade;
        double average = 0;
        while (!validAmount) {
            value = (JOptionPane.showConfirmDialog(null, "Do you want to calculate your average for the 3 exam?",
                    "Average Exam " +
                            "Grade", JOptionPane.YES_NO_OPTION));
            if (value == JOptionPane.YES_OPTION) {
                validAmount = true;
            }
            else {
                JOptionPane.showMessageDialog(null, stringToDisplay.append("Thank you for your time!"));
                break;
            }
            while (!valid) {
                try {
                    inputString = JOptionPane.showInputDialog("First Exam Grade: ");
                    firstExamGrade = Integer.parseInt(inputString);
                    inputString = JOptionPane.showInputDialog("Second Exam Grade: ");
                    secondExamGrade = Integer.parseInt(inputString);
                    inputString = JOptionPane.showInputDialog("Third Exam Grade: ");
                    thirdExamGrade = Integer.parseInt(inputString);
                    //calculating the average of 3 exam grades
                    average = (float) (firstExamGrade + secondExamGrade + thirdExamGrade) / 3;
                    if (firstExamGrade > 0 && secondExamGrade > 0 && thirdExamGrade > 0) {
                        valid = true;
                    }
                    if (average >= 75) {
                        stringToDisplay1 += ("Good Remarks!\n");
                        stringToDisplay1 += ("Your average from the 3 exam grade is ") + average + ('\n');
                        JOptionPane.showMessageDialog(null, stringToDisplay1);
                    } else if (average < 75) {
                        stringToDisplay1 += (":-(\n");
                        JOptionPane.showMessageDialog(null, stringToDisplay1);
                    }//end of inside while loop
                } catch (HeadlessException | NumberFormatException e) {
                    throw new RuntimeException(e);
                }
            }//end of while loop
        }
        // if the conditional statement (i.e., validAmount is true) then this block of code will be executed
        JOptionPane.showMessageDialog(null, "Thank you for submitting!");
    }
}