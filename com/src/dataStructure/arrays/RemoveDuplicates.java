package dataStructure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public void removeDuplicates(int[] arr){
        int[] arr1 = new int[arr.length];
        Arrays.sort(arr);
        int k=0;
        arr1[k]= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr1[k]!=arr[i]){
                k += 1;
                arr1[k] = arr[i];
            }
        }

        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        RemoveDuplicates obj = new RemoveDuplicates();
        obj.removeDuplicates(arr);
    }
}
