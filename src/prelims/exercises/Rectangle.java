package prelims.exercises;
import java.lang.*; //import java.lang package
/*
* Name: LOU DIAMOND T. MORADOS
* Programming Date: AUGUST 24. 2022
* Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input: length and width of a rectangle
Processes: Compute the perimeter of the rectangle
Compute the perimeter of a rectangle
Display results
Output: perimeter, area
------------------------------------------------------------------
Algorithm:
1. Assign the length and width of a rectangle
2. Compute the perimeter : perimeter = 2*l + 2*w, where l is the length and w is width of a rectangle
3. Compute the area: area = length * width
4. Show the length and width of rectangle
5. Show the perimeter of a rectangle
6. Show the area of the rectangle
------------------------------------------------------------------
Step-by-step process:
1. Create a global int class with an object defined as length and width
2. Create a double class assigned to the variable perimeter and area
3. Assigned a formula for perimeter and area
4. Print out horizontal line of asterisk
5. Print out perimeter value
6. Print out area value
7. Print out horizontal line of asterisk
 */
public class Rectangle {
    static int length = 10;
    static int width = 10;
    public static void main(String[] args) {
        double perimeter = 2*length + 2*width;
        double area = length * width;
        System.out.println("*************************");
        System.out.println("Perimeter: "+perimeter+"");
        System.out.println("Perimeter: "+area+"");
        System.out.println("*************************");
    } // end of main method
} // end of class rectangle
