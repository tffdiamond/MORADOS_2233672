package something.tutorials;

import java.util.Scanner;

/*
* Name: MORADOS, Lou Diamond T.
* Programming Date: August 24, 2022
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

Step-by-step process
* 1.

-------------------------------------------------------------------
*/
public class RadiusOfCircle {
    public static void main(String[] args) {
        //Create Scanner
        Scanner userInput  = new Scanner(System.in);

        //User input
        System.out.println("Welcome to circle!" );
        System.out.print("Please enter your value for radius: ");
        double radius = userInput.nextDouble();

        //Close Scanner
        userInput.close();
        //Compute
        double circumference = 2 * Math.PI * radius;
        double areaOfCircle = Math.PI * radius * radius;
        //Print out results
        System.out.println("Here's the computation for" );
        System.out.printf("Radius: %.2f\n", radius );
        System.out.printf("Circumference: %d * %.4f * %f = %f\n", 2, 3.1416, radius, circumference);
        System.out.printf("areaOfCircle: %.4f * %f * %f = %f\n", 3.1416, radius, radius, areaOfCircle);
    }
}
