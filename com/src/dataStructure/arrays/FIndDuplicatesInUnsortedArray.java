package dataStructure.arrays;

import java.util.Scanner;

public class FIndDuplicatesInUnsortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

//        for(int i=0; i<arr.length;i++){
//            for(int j=arr.length -1; j>i; j--){
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[i]);
//                }
//            }
        int[] arr1 = new int[arr.length];
        int counter = 0;
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    if(counter == 0){
                        arr1[counter] = arr[i];
                        counter++;
                    }
                    else{
                        for(int k=0; k< counter; k++){
                            if(arr[i] == arr[k]){
                                continue;
                            }
                            else{
                                arr1[counter] = arr[i];
                            }
                        }
                    }
                }
            }
        }

        for(int i =0;i<=counter;i++){
            System.out.println(arr1[i]);
        }
    }
}
