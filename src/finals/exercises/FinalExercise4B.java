package finals.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class FinalExercise4B {
    void bubbleSorting(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr2[i] > arr2[j]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[i];
                    arr2[i] = temp;
                }
            }
        }
    }
    void printedArray(int[] arr1, int[] arr2){
        System.out.println("Sorted Array in descending order");
        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println("Sorted Array in ascending order");
        for (int j : arr1) {
            System.out.println(j);
        }

    }
    public static void main(String[] args) {
        FinalExercise4B obj = new FinalExercise4B();
        int num1 = keyboardInput();
        int[] arr1 = new int[num1]; //ascending order
        int[] arr2 = new int[num1]; //descending order
        elementsOfArray(arr1, arr2);
        obj.bubbleSorting(arr1, arr2);
        obj.printedArray(arr1, arr2);
    }
    static void elementsOfArray(int[] arr1, int[] arr2){
        Scanner kyb = new Scanner(System.in);
        for (int i=0; i<arr1.length && i< arr2.length; i++){
            System.out.println("Please input the unsorted elements of an array");
            arr1[i] = Integer.parseInt(kyb.nextLine());
            arr2[i] = arr1[i];
        }
        System.out.println("Unsorted Array: "+ Arrays.toString(arr2));
    }
    static int keyboardInput(){
        Scanner kyb = new Scanner(System.in);
        System.out.println("How many elements in the array? ");
        return Integer.parseInt(kyb.nextLine());
    }
}
