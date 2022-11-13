package something.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner kyb = new Scanner(System.in);
        Random rand = new Random();
        int[] arr = new int[20];
        for (int i=0; i< arr.length; i++){
            arr[i] = rand.nextInt(20);
        }
        System.out.println("The elements of an array: "+Arrays.toString(arr));
        System.out.println("Please input a number to remove");
        int num1 = Integer.parseInt(kyb.nextLine());

        int[] arr_new = new int[arr.length-1];
        for(int i=0, k=0;i<arr.length;i++){
            if(arr[i]!=num1){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));



//
//        Scanner kyb = new Scanner(System.in);
//        System.out.println("Please input a number");
//        int num1 = Integer.parseInt(kyb.nextLine());
//        Random rand = new Random();
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        ArrayList<Integer> new_arr = new ArrayList<>();
//        for (int i=0; i<20; i++){
//            arr.add(rand.nextInt(20));
//        }
//        new_arr = arr;
//        for (int j=0, k=0; j< arr.size(); j++){
//            if (arr.get(j) != num1){
//
//            }
//        }
//        System.out.println("The new array is: "+new_arr);

    }
}
