package dataStructure.arrays;

import java.util.Scanner;

public class PairSumEqualToGivenNumber {

    public void checkSum(int[] arr, int number){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum == number){
                    System.out.println("Pair = ("+arr[i]+", "+arr[j]+")");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Number to be checked: ");
        int number = scn.nextInt();

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        PairSumEqualToGivenNumber obj = new PairSumEqualToGivenNumber();
        obj.checkSum(arr, number);
    }
}
