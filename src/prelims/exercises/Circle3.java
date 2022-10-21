package prelims.exercises;

import java.util.Scanner;

// The filename for the following source code must be Circle2.java
/*
Name: LOU DIAMOND T. MORADOS
Programming Date: August 31 , 2022,
Activity Name and Number: Prelim Exercise Number 4
Problem:
Write a program that will show the area and circumference of a circle with a given radius.
Analysis:
Input: radius of a circle
Processes: Compute the area and circumference of the circle
Display the data associated with the circle
Output: area and circumference
Algorithm:
1. Assign the radius of the circle
2. Compute the area: area = pi * radius^2
3. Compute the circumference: circumference = 2pi * radius
3. Show the given radius of the circle
4. Show the computed area and circumference of the circle
*/
public class Circle3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of a circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("\nProperties of a circle");
        System.out.println("**************************************************");
        System.out.printf("*%24s%.2f%21s" ,"Radius of a circle: ",+radius,"*\n");
        System.out.printf("*%25s%.2f%18s","Area of a circle is: ",+area,"*\n");
        System.out.printf("*%34s%.2f%10s","Circumference of a circle is: ",+circumference,"*\n");
        System.out.println("**************************************************");
    }
}
