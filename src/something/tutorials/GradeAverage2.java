package something.tutorials;

import java.util.Scanner;

public class GradeAverage2 {
    public static void main(String[] args)
    {
        /* This program assumes that the student has 6 subjects,
         * thats why I have created the array of size 6. You can
         * change this as per the requirement.
         */
        int [] marks = new int[6];
        int i;
        float total=0, avg;
        Scanner keyboard = new Scanner(System.in);
        for(i=0; i<6; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = keyboard.nextInt();
            total = total + marks[i];
        }
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60)
        {
            System.out.print("B");
        }
        else if(avg>=40)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
