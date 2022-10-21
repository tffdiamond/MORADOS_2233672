package prelims.activities;
/**
 * Name: Lou Diamond T. Morados
 * Date: 9/21/2022
 * Module 3 Activity
 *
 * Problem: Create a program that computes some base raised to arbitrary number
 *
 * Algorithm:
 *
 * Input:
 * - Base
 * - Exponent
 *
 * Output:
 * - Computation of inputted base multiplied to itself (i.e., the exponent)
 *
 * Process:
 * 1. Declare a primitive variable that stores the input values of the user (i.e., base, exponent, except result set
 * to 1)
 * 2. Create an object of Scanner class
 * 3. Takes the input value of the user
 * 4. Construct a while loop, within the loop, the computation for the inputted base and exponent is stored in
 * result: result *= base
 * 5. Print the output of result using println
 */
import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        int base, exponent;
        int result = 1;
        Scanner kyb = new Scanner(System.in);
        System.out.println("Base:");
        base = kyb.nextInt();
        System.out.println("Exponent: ");
        exponent = kyb.nextInt();
        while (exponent >= 1){
            result *= base;
            --exponent;
        }
        System.out.println(result);
    }
}
