package dataStructure.arrays;

import java.util.Scanner;

public class FindTargetElement {

    public void findIndex(int x, int[] array){
        for(int i=0; i < array.length; i++){
            if(array[i] == x){
                System.out.println("Index of element: "+i);
                break;
            }
    }}

    public void findIndex(String str, String[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(str)){
                System.out.println("Index of String: "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        scn.nextLine();
        //int len = Integer.parseInt(n);
        String[] arr = new String[n];
        System.out.println("Enter "+ n + " elements for array: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextLine();
            if(i != n-1){
                scn.nextLine();
            }
        }
        System.out.println("Enter element to be searched: ");
        String element = scn.nextLine();
        FindTargetElement obj = new FindTargetElement();
        obj.findIndex(element, arr);
}}
