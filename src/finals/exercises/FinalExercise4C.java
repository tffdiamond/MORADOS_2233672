package finals.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FinalExercise4C {
    void selectionSorting(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        for (int i=0; i<n-1; i++){
            int min_index = i;
            for (int j=i+1; j<n; j++)
                if (arr1[j] < arr1[min_index])
                    min_index = j;

            int temp = arr1[min_index];
                arr1[min_index] = arr1[i];
                arr1[i] = temp;
        }

        for (int i=0; i<m-1; i++){
            int min_index = i;
            for (int j=i+1; j<m; j++)
                if (arr2[j] > arr2[min_index])
                    min_index = j;

            int temp = arr2[min_index];
            arr2[min_index] = arr2[i];
            arr2[i] = temp;
        }
    }
    void printedArray(int[] arr1, int[] arr2){
        System.out.println("Sorted Array in descending order");
        for (int i : arr2){
            System.out.println(i);
        }
        System.out.println("Sorted Array in ascending order");
        for (int j : arr1){
            System.out.println(j);
        }
    }
    public static void main(String[] args) {
        Scanner kyb = new Scanner(System.in);
        System.out.println("How many elements in the array? ");
        int num1 = Integer.parseInt(kyb.nextLine());
        FinalExercise4C obj = new FinalExercise4C();
        int[] arr1 = new int[num1]; //ascending order
        int[] arr2 = new int[num1]; //descending order
        randomNumber(arr1, arr2);
        obj.selectionSorting(arr1, arr2);
        obj.printedArray(arr1, arr2);
    }
    static void randomNumber(int[] arr1, int[] arr2){
        Random rand = new Random();
        for (int i=0; i<arr1.length; i++){
            arr1[i] = rand.nextInt(100);
        }
        for (int i=0; i<arr2.length; i++){
            arr2[i] = rand.nextInt(100);
        }
        System.out.println("Unsorted Array of descending order "+Arrays.toString(arr2));
        System.out.println("Unsorted Array of ascending order "+Arrays.toString(arr1));
    }
}
