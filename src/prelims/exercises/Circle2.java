package prelims.exercises;
import java.lang.*;

// The filename for the following source code must be Circle2.java
/*
Name: LOU DIAMOND T. MORADOS
Programming Date: August 31 , 2022
Activity Name and Number: Prelim Exercise Number 3
Problem:
Write a program that will show the radius of a circle with a given area.
Analysis:
Input: area of a circle (area)
Processes: Compute the radius of the circle
Display the data associated with the circle
Output: radius
Algorithm:
1. Assign the area of the circle
2. Compute the radius: radius = square root of (area/PI)
3. Show the given area of a circle
4. Show the computed radius of the circle with a given area
*/
public class Circle2 {

    public static void main(String[] args) {
                double radius;
                double area;
                area = 100.0;
                radius= Math.sqrt(area / Math.PI) ;
                System.out.println( );
                System.out.println( );
                System.out.println(" ********************************************************");
                System.out.println(" * Given area of circle = " + area + " *");
                System.out.println(" * Computed radius of the circle = " + radius + " *");
                System.out.println(" ********************************************************");
            } // end of the main method
        } // end of Circle2 class