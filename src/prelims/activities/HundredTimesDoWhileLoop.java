package prelims.activities;
/**
 * Name: Lou Diamond T. Morados
 * Date: 9/21/2022
 * Module 3 Activity
 *
 * Problem: Create a program that iterates the inputted value
 *
 * Algorithm:
 *
 * Input:
 * - inputted println value
 *
 * Output:
 * - repetition of println value
 *
 * Process:
 * 1. Declare a primitive variable (i.e., i) that is initialized to zero
 * 2. Create the do-while loop for which the do loop is executed ONCE before verifying if the condition is true from
 * the declared variable
 * 3. Print the output using println 100 times
 */
public class HundredTimesDoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Lou Diamond T. Morados");
            i++;
        }
        while (i < 100);
    }
}
