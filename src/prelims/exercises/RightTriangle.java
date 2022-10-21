package prelims.exercises;
import java.lang.*; //import java.lang package
/*
* Name: LOU DIAMOND T. MORADOS
* Programming Date: AUGUST 24. 2022
* Activity Name and Number: Prelim Exercise Number 2

-----------------------------------------------------------------
Input: base, height, and hypotenuse of a right triangle
Processes: Compute the perimeter and area of the right triangle
Display results
Output: perimeter, area
------------------------------------------------------------------
Algorithm:
1. Assign the base, hypotenuse, and height of a right triangle
2. Compute the right triangle : perimeter = base + height + hypotenuse
3. Compute the right triangle : area = 1/2 * base * height
4. Show the perimeter of the right triangle
5. Show the area of a right triangle

Step-by-step process:
1. Create an int classes named as base, hypotenuse, and height respectively.
2. Create a double class and call a variables perimeter and area.
3. Assign the formula for the variables on the parameters.
4. Print out the perimeter value
5. Print out the area value

 */
public class RightTriangle {
    public static void main(String[] args) {
        int base = 10;
        int hypotenuse = 10;
        int height = 10;
            double perimeter = base + height + hypotenuse;
            double area = (float)1/(float)2 * base * height;
        System.out.println("**************************");
        System.out.printf("*%22s","Perimeter: "+perimeter+"*\n");
        System.out.printf("*%18s","Area: "+area+"*\n");
        System.out.println("**************************");
    }
}
