package something.tutorials;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner kyb = new Scanner(System.in);
        System.out.println("First Number ");
        int a = kyb.nextInt();
        System.out.println("Second Number ");
        int b = kyb.nextInt();
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
        System.exit(0);
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
}

