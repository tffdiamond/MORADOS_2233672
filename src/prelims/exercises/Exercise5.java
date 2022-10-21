package prelims.exercises;
import java.util.*;
import java.lang.*;
// The filename for the following source code must be Exercise5.java
/*
Name: LOU DIAMOND T. MORADOS
Programming Date: September 7 , 2022,
Activity Name and Number: Prelim Exercise Number 5*/
public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give a first number: ");
        double n1 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Give a second number: ");
        double n2 = Integer.parseInt(keyboard.nextLine());
        System.out.println("Give a third number: ");
        double n3 = Integer.parseInt(keyboard.nextLine());
        System.out.println("You entered the numbers " + n1 + ", " + n2 + " and " + n3);
        double m4 = n1 * n2 * n3;
        int q4 = (int) (n1 + n2/n3);
        double q42 = q4;
        float a4 = (float) (n1 + n2 + n3);
        double square1 = Math.pow(n1, 2);
        double square2 = Math.pow(n2, 2);
        double square3 = Math.pow(n3, 2);
        /*#1. Compute the product of the three numbers, store it in another integer variable and display this value.*/
        System.out.println("The product of three integers is: "+m4);
        /*#2. Get the sum of the first two numbers and divide it by the third number,compute only for the integer quotient and display the value. */
        System.out.println("The quotient of the sum of the first two numbers and last number for the integer quotient is: "+q4);
        /*#3. Get the sum of the first two numbers and divide it by the third number,compute for the exact quotient and display the value. */
        System.out.println("The quotient of the sum of the first two numbers and last number for the exact quotient is: "+q42);
        /*#4. Compute the average of the three numbers and display the result with 2 decimal values shown. */
        System.out.printf("The average of the three numbers is: %.2f + %.2f + %.2f = %.2f\n",n1,n2,n3,a4);
        /*#5. Compute the square of each number and display the results. */
        System.out.println("Square of the first number: "+square1);
        System.out.println("Square of the second number: "+square2);
        System.out.println("Square of the third  number: "+square3);
    } // end of the main method
} //end of class Exercises5
