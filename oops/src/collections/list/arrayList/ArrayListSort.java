package collections.list.arrayList;

import java.util.ArrayList;
import java.util.*;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<Integer>();
        array_list.add(2);
        array_list.add(4);
        array_list.add(1);
        array_list.add(3);

        System.out.println("Before sorting list");
        System.out.println(array_list);
        Collections.sort(array_list);
        System.out.println("After sorting list");
        System.out.println(array_list);
    }
}
