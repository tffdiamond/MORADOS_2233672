package finals.exercises;

import java.util.*;


public class MoradosLouProgramming1Project {
    static Scanner keyboard = new Scanner(System.in);
        // main method
        public static void main(String[] args) {
            int myChoice;
            showIntroduction();
            keyboard.nextLine();
            do {
                showMainMenu();
                myChoice = enterChoice(1, 4);
                switch (myChoice) {
                    case 1:
                        mathSolver();
                        break;
                    case 2:
                        recordKeeping();
                        break;
                    case 3:
                        miscellaneousProcesses();
                        break;
                    case 4:
                        System.out.println("Thank you for using my program.");
                        System.out.println("Enjoy the rest of your day.");
                } //end switch
            } while (myChoice != 4);
        } //end main method
        public static void showIntroduction() {
            System.out.println("\n\n\n");
            System.out.println("College of Information and Computing Sciences");
            System.out.println(" Saint Louis University");
            System.out.println(" Baguio City ");
            System.out.println("---------------------------------------------");
            System.out.println("\n");
            System.out.println(" Lou Diamond T Morados ");
            System.out.println(" Programmer");
            System.out.println("\n");
            System.out.print("Please press a key to see Main Menu...");
        }

        public static void showMainMenu() {
            System.out.println("Main Menu ");
            System.out.println("----------------------------");
            System.out.println("1. Math Routines");
            System.out.println("2. Recording Routines");
            System.out.println("3. Miscellaneous Routines");
            System.out.println("4. Exit");
            System.out.println("------------------------------");
        }
        public static void showMenu1() {
            System.out.println("Math Routine Submenu ");
            System.out.println("-----------------------------------------------");
            System.out.println("1. Determine whether an integer is odd or even");
            System.out.println("2. Determine sum of a series");
            System.out.println("3. Determine the factors of a number");
            System.out.println("4. Determine if a number is prime");
            System.out.println("5. Determine the area of a circle");
            System.out.println("6. Determine the area of a square");
            System.out.println("7. Determine the area of a triangle");
            System.out.println("8. Determine the area of a rectangle");
            System.out.println("9. Determine the area of a trapezoid");
            System.out.println("10. Determine the area of a parallelogram");
            System.out.println("11. Determine if an integer is a perfect number");
            System.out.println("12. Generate a multiplication table");
            System.out.println("13. Determine the roots of a quadratic equation");
            System.out.println("14. Generate a Fibonacci Sequence");
            System.out.println("15. Generate a Pascal's Triangle");
            System.out.println("16. Back to Main Menu");
            System.out.println("------------------------------------------------");
        }
        public static void showMenu2() {
            System.out.println("Recording Routine Submenu ");
            System.out.println("-----------------------------------------------");
            System.out.println("1. Accept and sort list of students");
            System.out.println("2. Accept and sort list of Salesmen");
            System.out.println("3. Accept pairs of names and grades and sort list according to name");
            System.out.println("4. Accept pairs of names and grades and sort list according to " +
                    "grade");
            System.out.println("5. Back to Main Menu");
            System.out.println("------------------------------------------------");
        }
        public static void showMenu3() {
            System.out.println("Miscellaneous Routine Submenu ");
            System.out.println("-----------------------------------------------");
            System.out.println("1. Number Guessing Game");
            System.out.println("2. Covid19 Self-Assessment Procedure ");
            System.out.println("3. Bills distribution of an amount of Money");
            System.out.println("4. Interest of Money Invested ");
            System.out.println("5. Income Tax Computation");
            System.out.println("6. Insect Population Growth Rate");
            System.out.println("7. Water Bill computaion.");
            System.out.println("8. Electric Bill computation.");
            System.out.println("9. Mobile Phone Load Balance Computation.");
            System.out.println("10. Back to Main Menu");
            System.out.println("------------------------------------------------");
        }

        public static int enterChoice(int min, int max) {
            int choice;
            do {
                System.out.print("Input the number corresponding to your choice: ");
                choice = keyboard.nextInt();
                if (choice < min || choice > max)
                    System.out.println("Invalid choice. Please ensure that you enter a number from " +
                            min + " to " + max + ".");
            } while (choice < min || choice > max);
            return (choice);
        }
        public static void mathSolver() {
            Scanner keyboard = new Scanner(System.in);
            int choice;
            do {
                showMenu1();
                choice = enterChoice(1, 16);
                switch (choice) {
                    case 1:
                        int y;

                        System.out.print("Enter an integer :");

                        y = keyboard.nextInt();
                        System.out.println(detOddEven(y));

                        System.out.println();
                        System.out.print("press enter to continue...");

                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 2:
                        int z;

                        System.out.print("Enter an integer :");

                        z = keyboard.nextInt();
                        System.out.println("The sum of the series is " + getSumOfSeries(z));
                        System.out.println();

                        System.out.print("press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 3:
                        int a;

                        System.out.println("Enter an integer : ");

                        a = keyboard.nextInt();

                        System.out.println("The factors of "+a+" is " + getFactors(a));
                        System.out.println();

                        System.out.print("press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 4:
                        int b;
                        boolean condition;

                        System.out.println("Enter an integer : ");

                        b = keyboard.nextInt();

                        condition = primeChecker(b);
                            if (!condition){
                                System.out.println("The number is not a prime number");
                            }
                            else {
                                System.out.println("The number is a prime number");
                            }
                        System.out.println();

                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 5:
                        double radius;
                        System.out.println("Please enter the radius of a circle: ");
                        radius = keyboard.nextDouble();

                        areaOfCircle(radius);

                        System.out.print("Press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 6:
                        double side;
                        System.out.println("Please enter the measure of a side of the square: ");
                        side = keyboard.nextDouble();

                        areaOfSquare(side);

                        System.out.print("Press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 7:
                        double base, triangleHeight;
                        System.out.println("Enter the base of a triangle");
                        base = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Enter the height of a triangle");
                        triangleHeight = Double.parseDouble(keyboard.nextLine());

                        areaOfTriangle(base, triangleHeight);

                        System.out.print("Press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 8:
                        double length, width;
                        System.out.println("Please enter a given length of the rectangle: ");
                        length = keyboard.nextDouble();

                        System.out.println("Please enter a given width of the rectangle: ");
                        width = keyboard.nextDouble();

                        areaOfRectangle(length,width);

                        System.out.print("Press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 9:
                        double base1, base2, trapezoidHeight;

                        System.out.println("Enter the length of base 1 of a trapezoid");
                        base1 = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Enter the length of base 2 of a trapezoid");
                        base2 = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Enter the height of a trapezoid");
                        trapezoidHeight = Double.parseDouble(keyboard.nextLine());

                        areaOfTrapezoid(base1, base2, trapezoidHeight);

                        System.out.print("Press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 10:
                        double parallelogramBase, parallelogramHeight;

                        System.out.println("Enter the base of a parallelogram");
                        parallelogramBase = Double.parseDouble(keyboard.nextLine());
                        System.out.println("Enter the height of a parallelogram");
                        parallelogramHeight = Double.parseDouble(keyboard.nextLine());
                        
                        areaOfParallelogram(parallelogramBase, parallelogramHeight);
                        break;
                    case 11:
                        int i, sumOfPrinted;
                        boolean verifier;
                        ArrayList<Integer> listPerfect;
                        System.out.println("Enter an integer : ");
                        i = keyboard.nextInt();

                        listPerfect = arrayPerfect(i);
                        System.out.println("The factors of "+i+" are "+listPerfect+"\n");
                        sumOfPrinted = printedPerfect(listPerfect);
                        verifier = isPerfect(sumOfPrinted,i);
                        if (!verifier) System.out.println("The number is not a perfect number");
                        else System.out.println("The number is a perfect number");
                        System.out.println();

                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 12:
                        int j, k;

                        System.out.println("How many rows do you want ?");
                        j = keyboard.nextInt();
                        System.out.println("How many columns do you want ? ");
                        k = keyboard.nextInt();

                        System.out.println("M U L T I P L I C A T I O N T A B L E");
                        generateMultiplicationTable(j,k);
                        System.out.println();

                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 13:
                        quadratricSolver();

                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 14:
                        int t;

                        System.out.print("\nHow many terms do you want? ");

                        t = keyboard.nextInt();
                        generateFibonacciSequence(t);
                        System.out.print("Press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 15:
                        int u;

                        System.out.println("How many rows do you want? ");
                        u = keyboard.nextInt();

                        generatePascalTriangle(u);

                        System.out.print("Press enter to continue...");
                        keyboard.nextLine();
                        keyboard.nextLine();
                        break;
                    case 16:
                        break;
                } // end of cases
            } while (choice != 16);
        } // end of mathSolver method

    private static void quadratricSolver() {
        Scanner keyboard = new Scanner(System.in);
        double a , b , c;
        double root1, root2;
        System.out.println("This program determines the roots of a quadratic equation" +
                "\nof the form ax^2 +bx +c = 0.");
        System.out.print("Enter the coefficient of x^2 (a): ");
        a = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter the coefficient of x (b): ");
        b = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter the constant (c): ");
        c = Double.parseDouble(keyboard.nextLine());
        double discriminant = Math.sqrt(b * b - 4 * a * c);
        root1 = (-b + discriminant)/(2*a);
        root2 = (-b - discriminant)/(2*a);
        System.out.printf("%c%.2f%s%.2f%s%.2f%s%.2f%s%.2f%c%n", '(', a, ") + (",
                b, ") + (", c, ") = 0 are ", root1, " and ", root2, '.');
    }

    private static void areaOfParallelogram(double parallelogramBase, double parallelogramHeight) {
        double area = parallelogramBase * parallelogramHeight;
        System.out.println("**********************************************");
        System.out.printf("*%25s%.2f%18s","Area of a trapezoid is: ",+area,"*\n");
        System.out.println("**********************************************");
    }

    private static void areaOfTrapezoid(double base1, double base2, double trapezoidHeight) {
        double area = (base1 + base2)*trapezoidHeight/2.0;
        System.out.println("**********************************************");
        System.out.printf("*%25s%.2f%18s","Area of a trapezoid is: ",+area,"*\n");
        System.out.println("**********************************************");
    }

    private static void areaOfTriangle(double base, double height) {
        double area = (base * height)/2.0;
        System.out.println("**********************************************");
        System.out.printf("*%25s%.2f%18s","Area of a triangle is: ",+area,"*\n");
        System.out.println("**********************************************");
    }

    private static void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("**********************************************");
        System.out.printf("*%25s%.2f%18s","Area of a rectangle is: ",+area,"*\n");
        System.out.println("**********************************************");

    }

    private static void areaOfSquare(double side) {
        double area = Math.pow(side, 2);
        System.out.println("**********************************************");
        System.out.printf("*%25s%.2f%18s","Area of a square is: ",+area,"*\n");
        System.out.println("**********************************************");
    }

    private static void areaOfCircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("*%25s%.2f%18s","Area of a circle is: ",+area,"*\n");
    }

    private static void generatePascalTriangle(int u) { //November 30, 2022
            for (int i=0; i<=u; i++){
                for (int j=0; j<=u-i; j++){
                    System.out.print(" ");
                }
                for (int j=0; j<=i; j++){
                    System.out.print(" "+factorialForm(i)/ (factorialForm(i-j)*factorialForm(j)));
                }
                System.out.println();
            }
    }

    private static int factorialForm(int i) { //November 30, 2022
            if (i == 0) return 1;
            return i * factorialForm(i-1);
    }

    private static void generateMultiplicationTable(int j, int k) { //November 30, 2022
            for (int i=1; i<=j; i++){
                for (int l=1; l<=k; l++){
                    System.out.print(l*i+"\t");
                }
                System.out.println();
            }
    }

    private static boolean isPerfect(int sumOfPrinted, int i) { //November 29, 2022
        return sumOfPrinted == i;
    }

    private static int printedPerfect(ArrayList<Integer> listPerfect) { //November 29, 2022
            int sum = 0;
        for (Integer integer : listPerfect) {
            sum += integer;
        }
        return sum;
    }

    private static ArrayList<Integer> arrayPerfect(int i) { //November 29, 2022
            ArrayList<Integer> sum = new ArrayList<>();
        for (int j = 1; j<i; j++){
            if (i % j == 0){
                sum.add(j);
            }
        }
        return sum;
    }

    private static boolean primeChecker(int b) { //November 29, 2022
        if (b == 0) System.out.println("Zero is not a prime nor composite");
        for (int i = 1; i < b; i++) {
            if (b % i == 0 && i > 1) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Integer> getFactors(int a) { //November 29, 2022
            ArrayList<Integer> factor = new ArrayList<>();
            for (int i=1; i <= a; i++){
                if (a % i == 0){
                    factor.add(i);
                }
                else {
                    factor.add(1);
                }
            }
            return factor;
    }

    public static void recordKeeping() {
            int choice;
            do {
                showMenu2();
                choice = enterChoice(1, 5);
                switch (choice) {
                    case 1:
                        acceptAndSortStudent();
                        break;
                    case 2:
                        acceptAndSortSalesmen();
                        break;
                    case 3:
                        namesPairGrades();
                        break;
                    case 4:
                        gradesPairName();
                        break;
                } // end of cases
            } while (choice != 5);
        } // end of recordKeeping method

    private static void acceptAndSortSalesmen() {//December 2, 2022
            Scanner keyboard = new Scanner(System.in);
            int n;
            String[] salesmen;

        System.out.println("How many salesmen to be sorted");
        n = Integer.parseInt(keyboard.nextLine());
        salesmen = new String[n];

        for (int i=0; i<salesmen.length; i++){
            System.out.println("Enter the name of salesmen "+(i+1)+": ");
            salesmen[i] = keyboard.nextLine();
        }

        System.out.println("\nUnsorted Salesmen");
        System.out.println(Arrays.toString(salesmen));
        System.out.println();

        insertionSorting(salesmen); //sorting algorithm

        System.out.println("Sorted Salesmen\n");
        for (String men : salesmen){
            System.out.println(men);
        }
    }

    private static void insertionSorting(String[] salesmen) { //December 2, 2022
            for (int i=1; i<salesmen.length; i++){
                String key = salesmen[i];
                int j = i-1;

                while (j >= 0 && salesmen[j].compareToIgnoreCase(key) > 0){
                    salesmen[j+1] = salesmen[j];
                    j = j -1;
                }
                salesmen[j+1] = key;
            }
    }

    private static void namesPairGrades() { //December 2, 2022
            Scanner keyboard = new Scanner(System.in);
            int n;
            String [][] sortingNameBased;
        System.out.println("Sorting According to name");
        System.out.println("How many names and grades will be sorted? ");
        n = keyboard.nextInt();

        sortingNameBased = new String[n][2];
        System.out.println("Enter the names and grades successively: ");
        for (int i=0; i<=n-1; i++){
            for (int j=0; j<2; j++){
                sortingNameBased[i][j] = keyboard.next();
            }
        }

        System.out.println("Unsorted Two Dimensional Array");
        System.out.println(Arrays.deepToString(sortingNameBased)+"\n");

        twoDimensionalSortingName(sortingNameBased);

        System.out.println("Sorted Two Dimensional Array");
        System.out.println(Arrays.deepToString(sortingNameBased));

        for (String[] pair : sortingNameBased) {
            for (String s : pair) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        System.out.println("\npress enter to continue...");
        keyboard.nextLine();
        keyboard.nextLine();

    }

    private static void twoDimensionalSortingName(String[][] pairs) { //December 2, 2022
            Arrays.sort(pairs, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return o1[0].compareToIgnoreCase(o2[0]);
                }
            });
    }

    private static void gradesPairName() { //December 2, 2022
            Scanner keyboard = new Scanner(System.in);
            String [][]sortingGradeBased;
            int n;

        System.out.println("How many names will be sorted? ");
        n = Integer.parseInt(keyboard.nextLine());
        sortingGradeBased = new String[n][2];

        System.out.println("Enter the name and its grade accordingly: ");
        for (int i=0; i<sortingGradeBased.length; i++){
            for (int j=0; j<2; j++){
                sortingGradeBased[i][j] = keyboard.next();
            }
        }

        System.out.println("Unsorted Two Dimensional Array");
        System.out.println(Arrays.deepToString(sortingGradeBased));
        System.out.println();

        twoDimensionalSortingGrade(sortingGradeBased);

        System.out.println("Sorted Two Dimensional Array");
        System.out.println(Arrays.deepToString(sortingGradeBased));
        for (String[] name : sortingGradeBased){
            for (String s : name){
                System.out.print(s+" ");
            }
            System.out.println();
        }

        System.out.println("press enter to continue...");
        keyboard.nextLine();
        keyboard.nextLine();
    }

    private static void twoDimensionalSortingGrade(String[][] salesmen) { //December 2, 2022
            Arrays.sort(salesmen, new Comparator<String[]>() {
                @Override
                public int compare(String[] o1, String[] o2) {
                    return o1[1].compareTo(o2[1]);
                }
            });
    }

    public static void acceptAndSortStudent() { //December 1, 2022
            Scanner keyboard = new Scanner(System.in);
            String[] names;

            int n;
            System.out.print("How many names will be sorted? ");
            n = Integer.parseInt(keyboard.nextLine());
            names = new String[n];
// Populate array names
            for (int z = 0; z < names.length; z++) {
                System.out.print("Enter name of student " + (z + 1) + ": ");
                names[z] = keyboard.nextLine();
            }
            System.out.println("\nUnsorted Names");
            System.out.println(Arrays.toString(names));
// Sort the names array
            System.out.println("\nSorted Names");
            System.out.println(Arrays.toString(balloonSortArray(names)));
//Show elements of names array
            showElements(names);

            System.out.println("\npress enter to continue...");
            keyboard.nextLine();
        }

    private static String[] balloonSortArray(String[] names) {//December 1, 2022
            for (int i=0; i<names.length; i++){
                for (int j=0; j<names.length-1; j++){
                    if (names[j].compareToIgnoreCase(names[j+1]) > 0){
                        String temp = names[j+1];
                        names[j+1] = names[j];
                        names[j] = temp;
                    }
                }
            }
        return names;
    }

    public static void miscellaneousProcesses() {
            Scanner keyboard = new Scanner(System.in);
            int choice;
            do {
                showMenu3();
                choice = enterChoice(1, 10);
                switch (choice) {
                    case 1:
                        higherOrLower();
                        System.out.print("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 2:
                        covidAssessment();
                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 3:
                        billsDistribution();
                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 4:
                        investedMoneyInterest();
                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 5:
                        incomeTaxComputation();
                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 6:
                        insectPopulationGrowthRate();
                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 7:
                        waterBill();
                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 8:
                        electricBill();
                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 9:
                        mobileLoadBalance();
                        System.out.println("press enter to continue...");
                        keyboard.nextLine();
                        break;
                    case 10:
                        break;
                } // end of cases
            } while (choice != 10);
        } // end of miscellaneousProcesses method

    private static void investedMoneyInterest() { //December 4, 2022
        Scanner keyboard = new Scanner(System.in);
        float annualRate;
        float quarterlyRate;
        double principal;
        double interest;
        double finalAmount;
        byte quarter;
        int year;
        annualRate = 0.05F; // set annual interest to 5%
        System.out.print("Enter the year: ");
        year = Integer.parseInt(keyboard.nextLine());
        System.out.print("Enter the initial principal: ");
        principal = Double.parseDouble(keyboard.nextLine());
        System.out.printf("%s%.2f%n", "Principal = ", principal);
        System.out.printf("%s%.2f%c%n", "Interest Rate = ", annualRate * 100, '%');
        System.out.printf("%6s%8s%16s%30s%n", "Year", "Quarter", "Interest Earned",
                "Amount at end of quarter");
        quarterlyRate = annualRate/4;
        quarter = 1;
        interest = principal*quarterlyRate;
        finalAmount = principal + interest;
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte) (quarter + 1);
        interest = principal*quarterlyRate;
        finalAmount = principal + interest;
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte) (quarter +1);
        interest = principal*quarterlyRate;
        finalAmount = principal + interest;

        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte) (quarter +1);
        interest = principal * quarterlyRate;
        finalAmount = principal + interest;
        System.out.printf("%6s%8d%16.2f%30.2f%n", year, quarter, interest, finalAmount);
    }

    private static void billsDistribution() { //December 4, 2022
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn, whole numbers only: ");
        int cashWithdrawn = Integer.parseInt(keyboard.nextLine());
        int oneThousandQnty = cashWithdrawn / 1000;
        int oneThousandRemder = cashWithdrawn % 1000;
        int fiveHundredQnty = oneThousandRemder / 500;
        int fiveHundredRemder = oneThousandRemder % 500;
        int oneHundredQnty = fiveHundredRemder / 100;
        int totalThousandAmount = oneThousandQnty * 1000;
        int totalFiveHundredAmount = fiveHundredQnty * 500;
        int totalOneHundredAmount = oneHundredQnty * 100;
        int totalBillsQnty = oneThousandQnty + fiveHundredQnty + oneHundredQnty;
        int totalBillsAmount = totalThousandAmount + totalFiveHundredAmount + totalOneHundredAmount;
        System.out.println("PESO BIILS"+"   "+"QUANTITY DISPENSED"+"   "+"AMOUNT");
        System.out.println("=========="+"   "+"=================="+"   "+"======");
        System.out.println("P1000 "+"                        "+oneThousandQnty  +"    "+totalThousandAmount);
        System.out.println("P500 "+"                         "+fiveHundredQnty  +"    "+totalFiveHundredAmount);
        System.out.println("P100 "+"                         "+oneHundredQnty   +"    "+totalOneHundredAmount);
        System.out.println("----------   ------------------   -------");
        System.out.println("Total No. of Bills:           "+totalBillsQnty+"    "+totalBillsAmount);
    }

    private static void incomeTaxComputation() { //December 4, 2022
        Scanner keyboard = new Scanner(System.in);
        double taxableIncome;
        double taxDue;
        byte bracket = 0;
        System.out.println("Income Tax Computation");
        System.out.print("Enter the taxable income: ");
        taxableIncome = keyboard.nextDouble();
        if (taxableIncome <= 25000.00)
            bracket = 1;
        if (taxableIncome > 25000.00 && taxableIncome <= 125000.00)
            bracket = 2;
        if (taxableIncome > 125000.00 && taxableIncome <= 525000.00)
            bracket = 3;
        if (taxableIncome > 525000.00)
            bracket = 4;
        taxDue = switch (bracket) {
            case 1 -> 4000.00;
            case 2 -> 4000.00 + (taxableIncome - 25000.00) * 0.08;
            case 3 -> 12000.00 + (taxableIncome - 125000.00) * 0.10;
            case 4 -> 62000.00 + (taxableIncome - 525000.00) * 0.12;
            default -> 0.00;
        }; // end of switch-case
        System.out.printf("%s%.2f%n", "Tax Due = ", taxDue);
    }

    private static void electricBill() { //December 4, 2022
        Scanner keyboard = new Scanner(System.in);
        String classificationConsumer;
        int presentReading, previousReading;
        int minCMResidential = 24;
        double minBillResidential = 360.00;
        float rateResidential = 60.00F;
        int minCMCommercial = 60;
        double minBillCommercial = 1200.00;
        float rateCommercial = 100.00F;
        char cType; //initialized cType
        String consumer;
        System.out.print("Enter the consumer's name: ");
        consumer = keyboard.nextLine();
        do {
            System.out.print("Enter the meter reading last month: ");
            previousReading = Integer.parseInt(keyboard.nextLine());
            if (previousReading < 0) {
                System.out.println("The meter reading cannot me negative.");
            }
        } while (previousReading < 0);
        do {
            System.out.print("Enter the meter reading this month: ");
            presentReading = Integer.parseInt(keyboard.nextLine());
            if (presentReading < 0) {
                System.out.println("The meter reading cannot me negative.");
            }
            if (presentReading < previousReading){
                System.out.println("The present water meter reading cannot be less than the previous water meter reading. ");
            }
        } while (presentReading < 0 || presentReading < previousReading);
        double nCMUsed = electricBillComputation(presentReading, previousReading);
        System.out.println("Are you a commercial or residential user? \n(c for commercial & r for residential) ");
        classificationConsumer = keyboard.nextLine();
        cType = classificationConsumer.charAt(0);
        System.out.println("Statement of the account");
        System.out.println("Name of the subscriber: "+consumer);
        System.out.println("Water reading last month: "+previousReading);
        System.out.println("Water reading this month: "+presentReading);
        System.out.println("Water consumption: "+nCMUsed);
        if (cType == 'c'){
            if (nCMUsed <= minCMCommercial){
                System.out.println("Amount due = "+minBillCommercial);
            }
            else if (nCMUsed > minCMCommercial) {
                System.out.println("Amount due = "+minBillCommercial+(nCMUsed-35)*rateCommercial);
            }
        }
        else if (cType == 'r') {
            if (nCMUsed <= minCMResidential) {
                System.out.println("Amount due = " + minBillResidential);
            } else if (nCMUsed > minCMResidential) {
                System.out.println("Amount due = " + minBillResidential + (nCMUsed - 20) * rateResidential);
            }
        }
    }

    private static double electricBillComputation(int presentReading, int previousReading) { //December 4, 2022
        int nCMUsed;
        nCMUsed = presentReading - previousReading;
        return nCMUsed;
    }

    private static void waterBill() { //December 4, 2022
        Scanner keyboard = new Scanner(System.in);
        String classicationConsumer;
        int presentReading, previousReading;
        int minCMResidential = 12;
        double minBillResidential = 180.00;
        float rateResidential = 30.00F;
        int minCMCommercial = 30;
        double minBillCommercial = 600.00;
        float rateCommercial = 50.00F;
        char cType; //initialized cType
        String consumer;
        System.out.print("Enter the consumer's name: ");
        consumer = keyboard.nextLine();
        do {
            System.out.print("Enter the meter reading last month: ");
            previousReading = Integer.parseInt(keyboard.nextLine());
            if (previousReading < 0) {
                System.out.println("The meter reading cannot me negative.");
            }
        } while (previousReading < 0);
        do {
            System.out.print("Enter the meter reading this month: ");
            presentReading = Integer.parseInt(keyboard.nextLine());
            if (presentReading < 0) {
                System.out.println("The meter reading cannot me negative.");
            }
            if (presentReading < previousReading) {
                System.out.println("The present water meter reading cannot be less than the previous water meter reading. ");
            }
        } while (presentReading < 0 || presentReading < previousReading);
        double nCMUsed = waterBillComputation(presentReading, previousReading);
        System.out.println("Are you a commercial or residential user? \n(c for commercial & r for residential) ");
        classicationConsumer = keyboard.nextLine();
        cType = classicationConsumer.charAt(0);
        System.out.println("Statement of the account");
        System.out.println("Name of the subscriber: " + consumer);
        System.out.println("Water reading last month: " + previousReading);
        System.out.println("Water reading this month: " + presentReading);
        System.out.println("Water consumption: " + nCMUsed);
        if (cType == 'c') {
            if (nCMUsed <= minCMCommercial) {
                System.out.println("Amount due = " + minBillCommercial);
            } else if (nCMUsed > minCMCommercial) {
                System.out.println("Amount due = " + minBillCommercial + (nCMUsed - 30) * rateCommercial);
            }
        } else if (cType == 'r') {
            if (nCMUsed <= minCMResidential) {
                System.out.println("Amount due = " + minBillResidential);
            } else if (nCMUsed > minCMResidential) {
                System.out.println("Amount due = " + minBillResidential + (nCMUsed - 12) * rateResidential);
            }
        }
    }

    private static double waterBillComputation(int presentReading, int previousReading) { //December 4, 2022
        int nCMUsed;
        nCMUsed = presentReading - previousReading;
        return nCMUsed;
    }

    private static void covidAssessment() { //December 4, 2022
        Scanner keyboard = new Scanner(System.in);
        char questionNumber1, questionNumber2, choice;
        boolean booleanValue = false;
        ArrayList<Integer> questionNumber3Array = new ArrayList<>();
        ArrayList<Object> listOfObjects = new ArrayList<>();
        try {
            do {
                System.out.println("NOTICE");
                System.out.println("All information provided should be true and complete otherwise you may be subjected to " +
                        "disciplinary action\n");
                System.out.println("In the past weeks, have you had any known  EXPOSURE  to confirmed COVID-19 patient? <y/n>");
                questionNumber1 = keyboard.nextLine().charAt(0);
                System.out.println("Have you tested  POSITIVE  for COVID-19 in the last 30 days?  <y/n>");
                questionNumber2 = keyboard.nextLine().charAt(0);
                if (questionNumber1 == 'y' && (questionNumber2 == 'y')) {
                    listOfObjects.add(questionNumber1);
                    listOfObjects.add(questionNumber2);
                } else if (questionNumber1 =='n' && questionNumber2 == 'n' ){
                    break;
                }
                }while (questionNumber1 != 'y' && (questionNumber2 != 'y'));
                System.out.println("MEDICAL HISTORY");
                System.out.println("Please enter the following number if you are currently experiencing or had any of the " +
                        "following for the last 7 " +
                        "days.\n");
                evaluationForm();
                questionNumber3Array = questionNumber3();
                do {
                    choice = repeatQuestion3();
                    switch (choice) {
                        case 'y':
                            questionNumber3();
                            break;
                        case 'n':
                            break;
                    }
                    listOfObjects.add(questionNumber3Array);
                } while (choice == 'y');
                for (int elementOfQuestionNumber3 : questionNumber3Array){
                    if (elementOfQuestionNumber3 == 7) {
                        booleanValue = true;
                        break;
                    }
                }
                if (listOfObjects.contains(questionNumber1) || listOfObjects.contains(questionNumber2) && (!booleanValue)){
                    System.out.println("Please seek to a NEAREST hospital immediately\n");
                } else {
                System.out.println("You do not have any covid symptoms however commend the government protocols " +
                        "appropriately");
            }
        } finally {
            System.out.println("Thank you for using the covid self-assessment program\n");
        }
    }


    private static char repeatQuestion3() { //December 4, 2022
            Scanner keyboard = new Scanner(System.in);
                System.out.println("Do you have more symptom in the following choices? <y/n>");
            return keyboard.nextLine().charAt(0);
    }

    private static ArrayList<Integer> questionNumber3() { //December 4, 2022
            Scanner keyboard = new Scanner(System.in);
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            int numberOfChoice;
        do {
            System.out.print("Input the number with respect to the symptoms you are experiencing: ");
            numberOfChoice = Integer.parseInt(keyboard.nextLine());
            integerArrayList.add(numberOfChoice);
            if (numberOfChoice > 8 || numberOfChoice < 0){
                System.out.println("Please input the number that exist from the options");
            } else if (numberOfChoice == 7) break;
        }while (numberOfChoice > 8 || numberOfChoice < 0);
        return integerArrayList;
    }

    private static void evaluationForm() { //December 4, 2022
        System.out.println("Press the number of choices of symptoms you are currently experiencing");
        System.out.println("1. Fever");
        System.out.println("2. Cough");
        System.out.println("3. Cold");
        System.out.println("4. Sore Throat");
        System.out.println("5. Difficulty Breathing");
        System.out.println("6. Diarrhea");
        System.out.println("7. None");
    }

    private static void mobileLoadBalance() { //December 3, 2022
            Scanner keyboard = new Scanner(System.in);
            int loadBalance, callMinutes, textMessages, ratePerCall, ratePerText,remainingLoadBalance;
        System.out.println("Prepaid load balance amount");
        loadBalance = Integer.parseInt(keyboard.nextLine());
        System.out.println("Total number of minutes used for calls");
        callMinutes =Integer.parseInt(keyboard.nextLine());
        System.out.println("Total number of messages sent");
        textMessages=Integer.parseInt(keyboard.nextLine());
        System.out.println("Rate per minutes for call");
        ratePerCall= Integer.parseInt(keyboard.nextLine());
        System.out.println("Rate per each text messages");
        ratePerText= Integer.parseInt(keyboard.nextLine());

        remainingLoadBalance = (loadBalance -(callMinutes*(ratePerCall)+textMessages*(ratePerText)));
        System.out.println("\nRemaining Amount of Prepaid Load = PhP"+remainingLoadBalance);
        System.out.println();

        System.out.println("press enter to continue...");
        keyboard.nextLine();
        keyboard.nextLine();
    }

    public static String detOddEven(int number) {
            if (number % 2 != 0)
                return (" The number is odd ");
            else
                return (" The number is even ");
        }
    public static double getSumOfSeries(int n) {
        double sum = 0;
        if (n > 1 && n % 2 == 0) {
            for (int ctr = n; ctr > 1; ctr -= 2)
                sum += (1.0 / ctr);
        }
        return (sum);
    } // end of method
    public static void higherOrLower() {
        Scanner keyboard = new Scanner(System.in);
        Random rndNoGen = new Random(); // Random class is a facility for
// generating random numbers
        int secretNo = rndNoGen.nextInt(100) + 1; // generate a random number
// that is in the range from 1 to 100.
        System.out.println("I have an integer from 1 to 100.");
        System.out.println("You have 10 chances to guess it.");
        int guessNo = 0;
        int guess;
        boolean gotIt = false;
        do {
            System.out.print("\nGuess #" + (guessNo + 1) + ": ");
            guess = keyboard.nextInt();
            if (guess == secretNo) {
                gotIt = true;
                break; // terminate the loop immediately
            } else {
                if (guessNo == 10) {
                    break; // terminate the loop immediately
                } else {
                    if (guess > secretNo) {
                        System.out.println("Try something lower.");
                    } else {
                        System.out.println("Try something higher.");
                    }

                    guessNo++;
                }
            }
        } while (guessNo < 10);
        if (gotIt) {
            System.out.println("\nCongratulations!!!");
            System.out.println("Got it in " + guessNo + " trial(s)!");
        } else {
            System.out.println("\nSorry. No more guesses left.");
            System.out.println("The number is " + secretNo + ".");
            System.out.println("Better luck next time.");
        }
        System.out.println("\nThanks for playing!!!");
        System.out.println("Have a nice day :)!");
    } // end of higherOrLower method
    public static void generateFibonacciSequence(int nTerms) {
        int first = 1, second = 1;
        int temp;
        int count = nTerms;
        System.out.print("Terms: ");
        if (nTerms == 1)
            System.out.println(first);
        if (nTerms == 2)
            System.out.println(first + " , " + second);
        if (nTerms > 2) {
            System.out.print(first + " , " + second);
            count = count - 2; // remaining terms to print
            while (count > 0) {
                temp = first;
                first = second;
                second = temp + second;
                System.out.print(" , " + second);
                count--;
            } // end of while
            System.out.println();
        } // end of if nTerms > 2
    } // end of generateFibonacciSequence method
    public static void insectPopulationGrowthRate() {
        Scanner keyboard = new Scanner(System.in);
        int fSize, iSize;
        double rateOfGrowth;
        System.out.println("Kindly enter the following:");
        System.out.print(" Initial population ... ");
        iSize = keyboard.nextInt();
        System.out.print(" Current population..... ");
        fSize = keyboard.nextInt();
        rateOfGrowth = (fSize - iSize) * 100.0 / iSize;
        System.out.print("\nThe rate of growth is " + rateOfGrowth + "%");
        System.out.println(" because (" + fSize + " - " + iSize + ") * 100 / " + iSize + " is " +
                rateOfGrowth + "%");
    } // end of insectPopulationGrowthRate method
    public static void showElements(String[] array) {  // Displays the elements of an array
        for (int x = 0; x < array.length; x++)
            System.out.println(array[x]);
    }
}
