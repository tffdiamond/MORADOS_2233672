package prelims.exercises;
import java.lang.*; //import java.lang package
/*
* Name: LOU DIAMOND T. MORADOS
* Programming Date: AUGUST 24. 2022
* Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input: Radius of a circle (radius)
Processes: Compute the circumference of the circle
Compute the area of the circle
Display results
Output: circumference, area
------------------------------------------------------------------
Algorithm:
1. Assign the radius of the circle
2. Compute the circumference : circumference = 2*(3.1416)*radius
3. Compute the area: area = PI*radius*radius
4. Show the radius of the circle
5. Show the circumference of the circle
6. Show the area of the circle

Step-by-step process:
1. Create a global class radius
2. Create a class for an object which is circumference and area
3. Print out horizontal line of asterisk
4. Print out radius value
5. Print out circumference value
6. Print out area value
7. Print out horizontal line of asterisk

-------------------------------------------------------------------
*/
public class Circle {
    static int radius = 10;
    public static void main(String[] args) {
        double circumference = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("************************************");
        System.out.printf("Radius:" +radius+"\n");
        System.out.printf("Circumference:" +circumference+"\n");
        System.out.printf("Area:" +area+"\n");
        System.out.println("************************************");
    } // end of main method
} // end of class circle
