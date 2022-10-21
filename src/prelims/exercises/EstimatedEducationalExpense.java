package prelims.exercises;
/**
 Name: LOU DIAMOND T. NIRADIS
 Programming Date: September 19, 2022,
 Activity Name and Number: Prelim Exercise Number 10
 Problem: Write a program that will let the user enter the full-time expenses of being a college student for one
 semester.
 * Algorithm:
        1. Let tuitionFee represent the estimated tuition fee of a full-time student
        for one semester
        2. Let boardAndLodging represent the estimated cost for one month of basic
        board and lodging

        3. Let livingAllowance represent the estimated living allowance needed by a
        fulltime student for one month
        4. Let semesterExpense represent the estimated amount needed by a fulltime
        student for one semester
        5. Let summerExpense represent the estimated amount needed by a fulltime
        student for one short term
        6. Let totalEstimatedExpense represent the amount needed by a fulltime
        student in order to finish his/her course for 8 semesters and 3 short terms.
        7. Read the value for tuitionFee
        8. Read the value for boardAndLodging
        9. Read the value for livingAllowance
        10. Compute the value for semesterExpense
        11. Compute the value for summerExpense
        12. Compute the value for totalEstimatedExpense
        13. Display the values
 **/
import java.util.Scanner;

public class EstimatedEducationalExpense {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double tuitionFee=0, boardAndLodging=0, livingAllowance=0, semesterExpense=0, summerExpense=0,
                totalEstimatedExpense=0;
        System.out.println("How much is your estimated tuition fee for one semester? ");
        tuitionFee = Double.parseDouble(keyboard.nextLine());
        System.out.println("Approximately, how much does your board and lodging for one-month cost? ");
        boardAndLodging = Double.parseDouble(keyboard.nextLine());
        System.out.println("How much is your estimated living allowance for one month? ");
        livingAllowance = Double.parseDouble(keyboard.nextLine());
        //computation for estimated amount for one semester
        boardAndLodging *= 5;
        livingAllowance *= 5;
        semesterExpense = tuitionFee + boardAndLodging + livingAllowance;
        summerExpense = semesterExpense * 0.35;
        //computation for total amount to graduate
        totalEstimatedExpense = semesterExpense * 8 + summerExpense * 3;
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Estimated Tuition Fee by a Student for one semester: "+semesterExpense);
        System.out.println("Estimated Board and Lodging cost per Semester: "+boardAndLodging);
        System.out.println("Estimated Board and Lodging cost per Semester: "+livingAllowance);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Estimated Amount Needed by a Student for one Semester: "+semesterExpense);
        System.out.println("Estimated Amount Needed by a Student for one Short term: "+summerExpense);
        System.out.println("Estimated Amount Needed by a Student for one Semester: "+totalEstimatedExpense);
        System.out.println("----------------------------------------------------------------------");

    }
}
