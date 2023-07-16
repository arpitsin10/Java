package dataStructure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateElements {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }

        int[] sorted_arr = new int[n];
        sorted_arr = arr;

        Arrays.sort(sorted_arr);
        for(int i=0; i<n-1; i++){
            if(sorted_arr[i] == sorted_arr[i+1]){
                System.out.print(sorted_arr[i]+ " ");
                int skip = 0;
                int j=i;
                while(j < n-1){
                    if(sorted_arr[j] == sorted_arr[j+1]){
                        skip =+ 1;
                    }
                    j++;
                }
                i = i+skip;
            }
        }
    }
}
