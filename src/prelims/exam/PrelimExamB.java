package prelims.exam;

import java.util.Arrays;
import java.util.Scanner;

public class PrelimExamB {
//    public static int fibonacci(int n) {
//        int a = 0;
//        int b = 1;
//
//        // Compute Fibonacci sequence.
//        for (int i = 0; i < n; i++) {
//            int temp = a;
//            a = b;
//            b = temp + b;
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//
//        // Get first 15 Fibonacci numbers.
//        for (int i = 0; i < 15; i++) {
//            System.out.println(fibonacci(i));
//        }
//    }
    public static void main(String[] args) {
       Scanner kyb = new Scanner(System.in);
        System.out.println("Fibonacci Sequence");
        System.out.println("How many terms do you want? ");
        int num = kyb.nextInt();
        int[] arr = new int[num];
        fibonacciSequence(num, arr);
        System.out.println(Arrays.toString(fibonacciSequence(num, arr)));
    }
    public static int[] fibonacciSequence(int num, int[] arr){
        for (int i=0; i<num; i++){
            for (int j=i+1; j<num-1; j++) {
                int temp = arr[i] + 1;
                arr[j] = temp;
                arr[j+1] = arr[j] + arr[i];
            }
        }
        return arr;
    }
}
