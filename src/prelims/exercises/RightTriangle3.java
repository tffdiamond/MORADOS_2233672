package prelims.exercises;

import java.util.Scanner;
import java.lang.*;

// The filename for the following source code must be Circle2.java
/*
Name: LOU DIAMOND T. MORADOS
Programming Date: August 31, 2022
Activity Name and Number: Prelim Exercise Number 3
Problem:
Write a program that will show the hypotenuse of a Right Triangle with a base and height.
Analysis:
Input: base and height of a Right Triangle
Processes: Compute the hypotenuse of the Right Triangle
Display the data associated with the Right Triangle
Output: Hypotenuse
Algorithm:
1. Assign the base and height of the Right Triangle
2. Compute the hypotenuse: hypotenuse = sqrt(base^2 + height^2)
3. Show the given base and height of a Right Triangle
4. Show the computed hypotenuse of the Right Triangle with a given base and height
*/
public class RightTriangle3 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a base of the Right Triangle: ");
        double base = kbd.nextDouble();
        System.out.println("Enter a height of the Right Triangle: ");
        double height = kbd.nextDouble();
        //close the scanner
        kbd.close();
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("*Given Right Triangle properties are as follows*");
        System.out.printf("*Base of Right Triangle: "+base+"*\n");
        System.out.printf("*Height of Right Triangle: "+height+"*\n");
        System.out.printf("*Hypotenuse of Right Triangle* "+hypotenuse+"*\n");
    }
}
