package prelims.exercises;

import java.util.Scanner;
import java.lang.*;
// The filename for the following source code must be Square3.java
/*
Name: LOU DIAMOND T. MORADOS
Programming Date: September 5, 2022
Activity Name and Number: Prelim Programming Exercise 4
Problem:
Write a program that computes and shows the area and perimeter of a square with
a given side. Let the side be entered through the keyboard at program runtime.
Analysis:
Input: Side of a square (side)
Processes:
Read the side of the square
Compute the area and perimeter of the square

Compute the area and perimeter of the square
Display results
Output: area, perimeter
Algorithm:
1. Read/Accept the side of the square
2. Compute the area: area= 2 * side
3. Compute the perimeter: perimeter = 4 * side
4. Show the side of the square
5. Show the perimeter of the square
6. Show the area of the square
*/
public class Square3 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter the measure of a side of the square: ");
        double side = kbd.nextDouble();
        double area = Math.pow(side, 2);
        double perimeter = Math.pow(side, 4);
        System.out.println("**********************************************");
        System.out.println("The given side of the square is: "+side);
        System.out.println("The area of the square is: "+area);
        System.out.println("the perimeter of the square is: "+perimeter);
        System.out.println("**********************************************");
    }
}
