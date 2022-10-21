package prelims.exercises;
/** Lou Diamond T. Morados
 * August 22, 2022
 *
 * Problem: Modify the program so that the output on screen will be different from the "hello world in a box formed
 * by asterisks”. For example, let the output of the program be typical of the content of a calling card (your
 * calling card).
 *
 * Algorithm:
 *
 * Input: N/A
 * Output: Personal Data
 *
 * Process:
 *  1) Print horizontal line of asterisk.
 *  2) Create a formatted string and use different format specifiers with "\n" which insert a new line.
 *  3) Print my slu student account
 *  4) Print my name
 *  5) Print my province
 *  6) Print my number
 *   **/
import java.lang.*; //import statement
public class Exercise1 {
    public static void main(String[] args){
        System.out.println("**********************");
        System.out.printf("*%22s", "*\n");
        System.out.printf("*%22s", "*\n");
        System.out.printf("*%22s", "*\n");
        System.out.printf("*%19s%3s", "2233672@slu.edu.ph","*\n");
        System.out.printf("*%19s%3s","LouDiamond Morados","*\n");
        System.out.printf("*%16s%6s", "Olongapo City", "*\n");
        System.out.printf("*%15s%7s", "09064348210","*\n");
        System.out.printf("*%22s", "*\n");
        System.out.printf("*%22s", "*\n");
        System.out.print("**********************");
        System.exit(0); //terminate the program
    } // end of main method
} // end of Exercise1 class