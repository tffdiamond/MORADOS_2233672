package midterms.exam;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        int year;
        boolean value;
        System.out.println("This application will create a typical calendar for a specified year");
        year = readYear();
        value = isLeapYear(year);
        calendar(startingDay(), value, year);
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
    static boolean isLeapYear(int year){
        boolean value;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("The inputted year is a leap year");
            value = true;
        } else {
            System.out.println("The inputted year is not a leap year");
            value = false;
        }
        return value;
    }
    static int startingDay(){
        Scanner kyb = new Scanner(System.in);
        int dayNumber;
        do {
            System.out.println("Enter the day for January 1: Sun=1, Mon=2, Tue=3, Wed=4, Thu=5, Fri=6, Sat=7 ");
            dayNumber = Integer.parseInt(kyb.nextLine());
            if (dayNumber <= 0){
                System.out.println("Day cannot be less than or equal to zero");
            }
        }while (dayNumber <=0);
        return dayNumber;
    }
    static void calendar(int dayNumber, boolean value, int year) {
        String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        int[] numbers = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int k = 0;
        if (value) {

            for (int i = 0; i < months.length; i++) { //prints the months' ex. january
                System.out.println(months[i]);
                for (int j = 0; j < day.length; j++) {//prints the day ex. sun
                    System.out.print(day[j] + "\t");
                }
                System.out.println();
                int d = day(i, 1, year);
                for (int m=0; m<d; m++)
                    System.out.print("\t");
                for (int l = 1; l <= numbers[k]; l++) {
                    System.out.print(l + "\t");

                    if (((l + d) % 7 == 0) || (l == numbers[k])) {
                        System.out.println();
                    }
                }
                k++;
                System.out.println();
            }
        }
        else {
            numbers[1] = 28;
            for (int i = 0; i < months.length; i++) { //prints the months' ex. january
                System.out.println(months[i]);
                for (int j = 0; j < day.length; j++) {//prints the day ex. sun
                    System.out.print(day[j] + "\t");
                }
                System.out.println();
                int d = day(i, 1, year);
                for (int m=0; m<d; m++)
                    System.out.print("\t");
                for (int l = 1; l <= numbers[k]; l++) {
                    System.out.print(l + "\t");

                    if (((l + d) % 7 == 0) || (l == numbers[k])) {
                        System.out.println();
                    }
                }
                k++;
                System.out.println();
            }
        }
    }
    static int day (int month, int day, int year){
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31*m)/12) % 7;
    }
}
