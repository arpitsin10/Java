package collections.list.arrayList;

import java.util.ArrayList;

public class ArrayListAddBetweenTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> array_list = new ArrayList<Integer>();
        array_list.add(1);
        array_list.add(2);
        array_list.add(4);

        System.out.println(array_list);
        array_list.add(2, 3);
        System.out.println(array_list);
    }
}
