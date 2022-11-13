package midterms.exam;

import java.util.Objects;
import java.util.Scanner;


public class LeapYearCalenderChecker {
    public static void main(String[] args) {
        int year;
        System.out.println("This application will create a typical calendar for a specified year");
        year = readYear();
        isLeapYear(year);
        char entry = repeatProcess();

    }
    static int readYear() {
        Scanner kyb = new Scanner(System.in);
        int year;
        do {
            System.out.println("Enter the year of creating a calendar");
            year = Integer.parseInt(kyb.nextLine());
            if (year <= 1582) {
                System.out.println("You must enter an integer that is not less than 1582");
            }
        } while (year <= 1582);
        return year;
    }
    static void isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The inputted year is a leap year");
        } else {
            System.out.println("The inputted year is not a leap year");
        }
    }
    static char repeatProcess(){
        Scanner kyb = new Scanner(System.in);
        String entry;
        do {
            System.out.println("Do you want to repeat the process? (y=yes & n=no)");
            entry = kyb.nextLine();
            if (!Objects.equals(entry, "y")){
                System.out.println("(y=yes & n=no)");
            }else if (!Objects.equals(entry, "n")){
                System.out.println("(y=yes & n=no)");
            }
        } while (!Objects.equals(entry, "y") && !Objects.equals(entry, "n"));
        return entry.charAt(0);
    }
}
