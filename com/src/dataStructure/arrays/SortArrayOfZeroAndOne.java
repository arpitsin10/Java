package dataStructure.arrays;

import java.util.Scanner;

public class SortArrayOfZeroAndOne {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements 0 and 1: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] arr1 = new int[arr.length];
        int front = 0;
        int back = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr1[front] = arr[i];
                front++;
            }
            if (arr[i] == 1) {
                arr1[back] = arr[i];
                back--;
            }
        }

        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}