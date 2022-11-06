package midterms.exercises;

import java.util.Scanner;

public class MidtermExercise5 {
    public static void main(String[] args) {
        int i;
        int [] grades = new int[10];
        int [] units = new int[10];
        int totalGrades=0, totalUnits=0, average;
        Scanner keyboard = new Scanner(System.in);
        for(i=0; i<10; i++){
            System.out.print("Enter the grade of the student for the subject "+(i+1)+":");
            grades[i] = Integer.parseInt(keyboard.nextLine());
            totalGrades += grades[i];
            System.out.print("Enter the unit of the student for the subject "+(i+1)+":");
            units[i] = Integer.parseInt(keyboard.nextLine());
            totalUnits += units[i];
        }
        average = totalGrades/10;
        System.out.println("The total grades of the student: "+totalGrades);
        System.out.println("The total units of the student:"+totalUnits);
        System.out.println("The Grade of a student is: "+average);
        if(average >= 85) System.out.println("Congratulations! You belong to the dean's list");
        else System.out.println("Sorry! You did not make it to the dean’s list. Do Better next term");
    }

}
