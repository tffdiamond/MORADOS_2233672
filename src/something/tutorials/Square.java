package something.tutorials;
import java.lang.*; //import java.lang package
/*
    * Name: LOU DIAMOND T. MORADOS
    * Programming Date: AUGUST 24. 2022
    * Activity Name and Number: Prelim Exercise Number 2

    -----------------------------------------------------------------
    Input: side of a square
    Processes: Compute the perimeter of the square
    Compute the area of a square
    Display results
    Output: perimeter, area
    ------------------------------------------------------------------
    Algorithm:
    1. Assign the side of a square
    2. Compute the square : square = 4*side where s is the side of a square
    3. Compute the area: area = 2*side
    4. Show the side of a square
    5. Show the perimeter of a square
    6. Show the area of the square
    ------------------------------------------------------------------
    Step-by-step process:
    1. Create a global static square class with an object defined as side
    2. Create a double class assigned to the variable perimeter and area
    3. Assigned a formula for perimeter and area
    4. Print out horizontal line of asterisk
    5. Print out perimeter value
    6. Print out area value
    7. Print out horizontal line of asterisk
    */
public class Square {
    public static class SquareVal {
        static int side = 69;
        public static void main(String[] args) {
            double perimeter = 4*side;
            double area = side * side;
            System.out.println("*************************");
            System.out.println("Perimeter: "+perimeter+"");
            System.out.println("Area: "+area+"");
            System.out.println("*************************");
        }
    }
}
