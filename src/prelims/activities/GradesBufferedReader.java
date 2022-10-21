package prelims.activities;
/**
 * Name: Lou Diamond T. Morados
 * Date: 9/21/2022
 * Module 3 Activity
 *
 * Problem: Create a program that inputs 3 exam grade using BufferedReader
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
 * 3. Take the input values from the user
 * 4. Calculate the average of the three exam grade: average = firstExamGrade + secondExamGrade + thirdExamGrade / 3
 * 5. Create if-else statements that subject the average of the three exam grade
 * 6. Print the output using println that is in the body of each if-else statement if the average of three
 * exam grade satisfies each parameter of if-else statement
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GradesBufferedReader {
    public static void main(String[] args) throws IOException {
        int firstExamGrade;
        int secondExamGrade;
        int thirdExamGrade;
        double average;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("First Exam Grade:");
        firstExamGrade = Integer.parseInt(br.readLine());
        System.out.println("Second Exam Grade:");
        secondExamGrade = Integer.parseInt(br.readLine());
        System.out.println("Third Exam Grade:");
        thirdExamGrade = Integer.parseInt(br.readLine());
        average = (float)(firstExamGrade + secondExamGrade + thirdExamGrade)/3;
        if (average >= 75) System.out.println("Good Remarks!");
        else System.out.println(":-(");
    }
}
