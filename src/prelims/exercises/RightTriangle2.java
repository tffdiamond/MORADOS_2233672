package prelims.exercises;
// The filename for the following source code must be Circle2.java
/*
Name: _____________________________
Programming Date: ___________________
Activity Name and Number: Prelim Exercise Number 3
Problem:
Write a program that will show the radius of a circle with a given area.
Analysis:
Input: base and height of a Right Triangle
Processes: Compute the hypotenuse of the Right triangle
Display the data associated with the Right Triangle
Output: radius
Algorithm:
1. Assign the base and height of the Right Triangle
2. Compute the hypotenuse = square root of (base^2 + height^2)
3. Show the given base and height of a right triangle
4. Show the computed hypotenuse of the right trinagle with a base and height
*/
import java.lang.*;
public class RightTriangle2 {
    public static void main (String [] args) {
        double height;
        double base;
        base = 100;
        height = 50;
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println( );
        System.out.println( );
        System.out.println(" ********************************************************");
        System.out.println(" * Given base of the Right Triangle: " + base + " *");
        System.out.println(" * Given height of the Right Triangle: " + height + " *");
        System.out.println(" * Computed Hypotenuse of the Right Triangle: "+hypotenuse );
        System.out.println(" ********************************************************");
    } // end of the main method
} // end of Circle2 class
