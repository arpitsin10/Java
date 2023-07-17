package dataStructure.arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesUsingCollections {

    public void removeDups(int[] arr){
        LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i])==null){
                map.put(arr[i], true);
            }
        }

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        RemoveDuplicatesUsingCollections obj = new RemoveDuplicatesUsingCollections();
        obj.removeDups(arr);
    }
}
