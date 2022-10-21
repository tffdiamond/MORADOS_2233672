package prelims.exercises;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;
import java.lang.*;
// The filename for the following source code must be Rectangle3.java
/*
Name: LOU DIAMOND T. MORADOS
Programming Date: September 5, 2022
Activity Name and Number: Prelim Programming Exercise 4
Problem:
Write a program that computes and shows the area and perimeter of a rectangle with
a given length and width. Let the length and width be entered through the keyboard at program runtime.
Analysis:
Input: Length and width of a rectangle
Processes:
Read the length and width of the rectangle
Compute the area and perimeter of the rectangle

Compute the area and perimeter of the rectangle
Display results
Output: area, perimeter
Algorithm:
1. Read/Accept the length and width of the rectangle
2. Compute the area: area= length * width
3. Compute the perimeter: perimeter = 2(length) * 2(width)
4. Show the length and width of the rectangle
5. Show the perimeter of the rectangle
6. Show the area of the rectangle
*/
public class Rectangle3 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter a given length of the rectangle: ");
        double length = kbd.nextDouble();
        System.out.println("Please enter a given width of the rectangle: ");
        double width = kbd.nextDouble();
        //close scanner
        kbd.close();
        double perimeter = Math.pow(length, 2) + Math.pow(width, 2);
        double area = length * width;
        System.out.println("************************************************");
        System.out.println("The given length of a rectangle is: "+length);
        System.out.println("The given width of a rectangle is : "+width);
        System.out.println("The perimeter of a rectangle is: "+perimeter);
        System.out.println("The area of a rectangle is: "+area);
        System.out.println("************************************************");
    }
}
