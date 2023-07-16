package collections.list.arrayList;

import java.util.ArrayList;

public class ArrayListChangeElement {
    public static void main(String[] args) {
        ArrayList<String> array_list = new ArrayList<String>();

        array_list.add("Geeks");
        array_list.add("Geeks");
        array_list.add("Geeks");

        System.out.println("Before changing: "+array_list);

        array_list.set(1, "For");
        System.out.println("After changing: "+array_list);
    }
}
