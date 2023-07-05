package collections.list.arrayList;

import java.util.ArrayList;

public class ArrayListAddElements {
    public static void main(String[] args) {
        ArrayList<String> array_list = new ArrayList<>();
        array_list.add("India");
        array_list.add("Australia");
        array_list.add("Kenya");

        System.out.println("Before inserting: "+array_list);
        array_list.add(2, "Paris");

        System.out.println("After inserting: "+array_list);
    }
}
